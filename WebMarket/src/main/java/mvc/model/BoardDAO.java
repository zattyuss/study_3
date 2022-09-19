package mvc.model;

import java.util.ArrayList;

public class BoardDAO {
	private static BoardDAO instance;
	
	private BoardDAO() {
		
	}
	
	public static BoardDAO getInstance() {
		if (instance == null)
			instance = new BoardDAO();
		return instance;
	}
	
	public int getListCount() {
		
		return 0;
	}
	
	public ArrayList<BoardDTO> getBoardList(int page, int limit, String items, String text){
		
		return null;
	}
	
	public String getLoginNameById(String id) { //member 테이블에서 인증된 id의 사용자명 가져오기
		return id; 
		
	}
	
	public void insertBoard(BoardDTO board) { //board 테이블에 새로운 글 삽입하기
		
	}
	
	public void updateHit(int num) { //선택된 글의 조회 수 증가시키기
		
	}
	
	public BoardDTO getBoardByNum(int num, int page) { //선택된 글 상세 내용 가져오기
		
		return null; 
	}
	
	public void updateBoard(BoardDTO board) { //선택된 글 내용 수정하기
		
	}
	
	public void deleteBoard(int num) { //선택된 글 삭제하기
		
	}
}
