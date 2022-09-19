package mvc.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BoardController extends HttpServlet{
	private static final long serialVersionUID = 1L;
	static final int LISTCOUNT = 5;
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String RequestURI = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = RequestURI.substring(contextPath.length());
		
		response.setContentType("text/html; charset=utf-8");
		
		if(command.equals("/BoardListAction.do")) { //등록된 글 목록 페이지 출력하기
			requestBoardList(request);
			RequestDispatcher rd = request.getRequestDispatcher("./board/list.jsp");
			rd.forward(request, response);
		}else if(command.equals("/BoardWriteForm.do")) { //글 등록 페이지 출력
			requestLoginName(request);
			RequestDispatcher rd = request.getRequestDispatcher("./board/writeForm.jsp");
			rd.forward(request, response);
		}else if(command.equals("/BoardWriteAction.do")) { //새로운 글 등록
			requestBoardWrite(request);
			RequestDispatcher rd = request.getRequestDispatcher("./BoardListAction.do");
			rd.forward(request, response);
		}else if(command.equals("/BoardViewAction.do")) { //선택된 글 상자 페이지 가져오기
			requestBoadrView(request);
			RequestDispatcher rd = request.getRequestDispatcher("/BoardView.do");
			rd.forward(request, response);
		}else if(command.equals("/BoardView.do")) { //글 상세 페이지 출력하기
			RequestDispatcher rd = request.getRequestDispatcher("./board/View.jsp");
			rd.forward(request, response);
		}else if(command.equals("/BoardUpdateAction.do")) { //선택된 글 수정하기
			requestBoardUpdate(request);
			RequestDispatcher rd = request.getRequestDispatcher("./board/writeForm.jsp");
			rd.forward(request, response);
		}else if(command.equals("/BoardDeleteAction.do")) { //선택된 글 수정하기
			requestBoardDelete(request);
			RequestDispatcher rd = request.getRequestDispatcher("./BoardListAction.do");
			rd.forward(request, response);
		}
	}





	private void requestBoardList(HttpServletRequest request) { //등록된 글 목록 가져오기
		
	}
	private void requestLoginName(HttpServletRequest request) { //인증된 사용자명 가져오기
		
	}
	private void requestBoardWrite(HttpServletRequest request) { //새로운 글 등록하기
		
	}
	private void requestBoadrView(HttpServletRequest request) { //선택된 글 상세 페이지 가져오기
		
	}
	private void requestBoardUpdate(HttpServletRequest request) { //선택된 글 내용 수정하기
		
	}
	private void requestBoardDelete(HttpServletRequest request) { //선택된 글 삭제하기
		
	}
}
