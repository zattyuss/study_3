package woowacrew.article.slack.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.ActiveProfiles;
import woowacrew.article.slack.domain.SlackConfig;
import woowacrew.article.slack.domain.SlackMessage;
import woowacrew.article.slack.domain.SlackMessageRepository;
import woowacrew.article.slack.dto.SlackMessageRequestDto;
import woowacrew.article.slack.exception.CreateSlackMessageFailException;
import woowacrew.article.slack.exception.NotFoundRecentlySlackMessageException;
import woowacrew.article.slack.exception.NotFoundSlackMessageException;
import woowacrew.article.slack.utils.SlackMessageConverter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@ActiveProfiles("test")
class SlackMessageInternalServiceTest {
    private static final String authorId = "UJ0NMF2M9";

    @Autowired
    private SlackConfig testSlackConfig;

    @Mock
    private SlackMessageRepository slackMessageRepository;

    @Mock
    private SlackConfig slackConfig;

    @Mock
    private SlackRequestService slackRequestService;

    @InjectMocks
    private SlackMessageInternalService slackMessageInternalService;


    private SlackMessage saveSlackMessage(String token, String channelId, String authorId) throws IOException {
        SlackMessageRequestDto slackMessageRequestDto = new SlackMessageRequestDto(channelId, authorId, "hi", "test.com", "test2.com", false);
        SlackMessage slackMessage = SlackMessageConverter.toEntity("channelName", "authorName", slackMessageRequestDto);

        when(slackConfig.getToken()).thenReturn(token);
        when(slackRequestService.createSlackMessage(any())).thenReturn(slackMessage);
        when(slackMessageRepository.save(slackMessage)).thenReturn(slackMessage);

        return slackMessageInternalService.save(slackMessageRequestDto);
    }

    @Test
    @DisplayName("??????????????? ???????????? ??? ???????????? ????????????")
    void save() throws IOException {
        String token = testSlackConfig.getToken();
        String channelId = testSlackConfig.getNoticeChannelId();
        String authorId = this.authorId;

        SlackMessage result = saveSlackMessage(token, channelId, authorId);

        assertThat(result.getAuthor()).isEqualTo("authorName");
        assertThat(result.getChannel()).isEqualTo("channelName");
        assertThat(result.getContent()).isEqualTo("hi");
        assertThat(result.getDownloadLink()).isEqualTo("test.com");
        assertThat(result.getDownloadLinkFromSlack()).isEqualTo("test2.com");
    }

    @Test
    @DisplayName("???????????? ?????? ????????? ?????? ??????????????? ????????????.")
    void saveFailBecauseToken() throws IOException {
        String invalidToken = "Invalid token";
        String channelId = testSlackConfig.getNoticeChannelId();
        String authorId = this.authorId;

        when(slackRequestService.createSlackMessage(any())).thenThrow(CreateSlackMessageFailException.class);

        assertThrows(CreateSlackMessageFailException.class, () -> saveSlackMessage(invalidToken, channelId, authorId));
    }

    @Test
    @DisplayName("??????????????? ?????? ??????????????? ?????????.")
    void findAll() {
        PageRequest pageable = PageRequest.of(0, 20);
        List<SlackMessage> slackMessages = new ArrayList<>();

        when(slackMessageRepository.findAll(pageable)).thenReturn(new PageImpl<>(slackMessages));

        slackMessageInternalService.findAll(pageable);
        verify(slackMessageRepository, times(1)).findAll(pageable);
    }

    @Test
    @DisplayName("??????????????? ID??? ?????? ???????????? ?????????.")
    void findById() {
        SlackMessage mockSlackMessage = mock(SlackMessage.class);

        when(slackMessageRepository.findById(1L)).thenReturn(Optional.ofNullable(mockSlackMessage));
        SlackMessage result = slackMessageInternalService.findById(1L);

        assertNotNull(result);
        assertThat(mockSlackMessage).isEqualTo(result);
    }

    @Test
    @DisplayName("?????? ID??? ?????? ???????????? ?????? ?????? ????????? ????????????.")
    void findByNotExistId() {
        when(slackMessageRepository.findById(1L)).thenReturn(Optional.empty());

        assertThrows(NotFoundSlackMessageException.class, () -> slackMessageInternalService.findById(1L));
    }

    @Test
    @DisplayName("?????? ?????? ???????????? ????????????.")
    void findRecentlyMessage() throws IOException {
        SlackMessage slackMessage = saveSlackMessage(testSlackConfig.getToken(), testSlackConfig.getNoticeChannelId(), this.authorId);
        when(slackMessageRepository.findFirstByOrderByCreatedDateDesc()).thenReturn(Optional.ofNullable(slackMessage));

        assertThat(slackMessageInternalService.findRecentlyMessage()).isEqualTo(slackMessage);
    }

    @Test
    @DisplayName("?????? ?????? ???????????? ?????? ??????, ????????? ????????????.")
    void notFoundRecentlySlackMessage() {
        when(slackMessageRepository.findFirstByOrderByCreatedDateDesc()).thenReturn(Optional.empty());

        assertThrows(NotFoundRecentlySlackMessageException.class, () -> slackMessageInternalService.findRecentlyMessage());
    }
}