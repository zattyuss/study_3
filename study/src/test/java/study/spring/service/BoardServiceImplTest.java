package study.spring.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import study.spring.AppTest;
import study.spring.model.Board;

public class BoardServiceImplTest extends AppTest{

	@Autowired
	BoardService service;
	
	
	@Test
	public void getListTest() {
		List<Board> list = service.getList();
		assertEquals(4, list.size());
	}

}
