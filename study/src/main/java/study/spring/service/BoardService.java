package study.spring.service;

import java.util.List;

import study.spring.model.Board;

public interface BoardService {
	List<Board> getList();
	Board get(Long bno);
	void register(Board board);
	void modify(Board board);
	void remove(Long bno);
}
