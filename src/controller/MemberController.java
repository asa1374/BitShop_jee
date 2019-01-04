package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("멤버 서블릿으로 들어옴");
		String cmd = request.getParameter("cmd");
		cmd = (cmd==null) ? "move": cmd;
		String dir = request.getParameter("dir");
		dir = (dir==null)? request.getServletPath().substring(1, request.getServletPath().indexOf('.')): dir ;
		String page = request.getParameter("page");
		page = (page==null)? "main":page;
		switch(cmd) {
		case "login" :
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			System.out.println("아이디 : "+id + "비번 : " + pass);
			if(!(id.equals("asa1374") && pass.equals("ckdwns2"))) {
				dir = "";
				page="index";
			}
			request.setAttribute("name", "이창준");
			request.setAttribute("compo", "login-success");
			Command.move(request, response, dir,page);
			break;
		case "move" :
			Command.move(request, response, dir,page);
			break;
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
