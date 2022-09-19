package study.spring.mapper;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import study.spring.AppTest;
import study.spring.model.Board;

public class BoardMapperTest extends AppTest{

	@Autowired
	private BoardMapper boardMapper;
	
	@Autowired
	private DataSource dataSource;
	
	
	@Before
	public void setUp() throws IOException, SQLException {
		Reader reader = Resources.getResourceAsReader("sql/board_ex.sql");
		ScriptRunner runner = new ScriptRunner(dataSource.getConnection());
		runner.runScript(reader);
	}
	
	
	
	@Test
	public void getListTest() {
		List<Board> list = boardMapper.getList();
		assertEquals(4, list.size());
	}

	@Test
	public void getTest() {
		Board board = boardMapper.get(1L);
		assertEquals("니 내 아나?", board.getTitle());
		assertEquals("반말하지마라.", board.getContent());
		assertEquals("정상수", board.getWriter());
	}
	
	@Test
	public void insertTest() {
		Board board = new Board();
		board.setTitle("니 내 아냐고");
		board.setContent("시발럼아");
		board.setWriter("땅뚜");
		boardMapper.insert(board);
		Board getBoard = boardMapper.get(5L);
		
		assertEquals(board.getTitle(), getBoard.getTitle());
		assertEquals(board.getContent(), getBoard.getContent());
		assertEquals(board.getWriter(), getBoard.getWriter());
		assertEquals(board.getBno(), getBoard.getBno());
	}
	
	@Test
	public void updateDate() {
		Board board = boardMapper.get(1L);
		board.setTitle("땅뚜바라기");
		board.setContent("개씨발럼");
		boardMapper.update(board);
		assertEquals("땅뚜바라기", board.getTitle());
		assertEquals("개씨발럼", board.getContent());
		assertEquals("정상수", board.getWriter());
	}
	
	@Test
	public void deleteTest() {
		boardMapper.delete(1L);
		boardMapper.delete(2L);
		Board board1 = boardMapper.get(1L);
		Board board2 = boardMapper.get(2L);
		Board board3 = boardMapper.get(3L);
		assertNull(board1);
		assertNull(board2);
		assertNotNull(board3);
		
	}
	
	
	
	
	
	
	
	
	
	
}
