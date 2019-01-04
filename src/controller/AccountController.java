package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Account로 진입");
		String cmd = request.getParameter("cmd");
		String dir = request.getParameter("dir");
		if(dir==null) {
			dir=request.getServletPath().substring(1, request.getServletPath().indexOf('.'));
		}
		System.out.println("dir====="+dir);
		String page = request.getParameter("page");
		page = (page==null)?"main":page;
		switch((cmd==null) ? "move": cmd) {
		case "move" :
			System.out.println("~~~~account 이동~~");
			Command.move(request, response, dir+"/"+page);
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
