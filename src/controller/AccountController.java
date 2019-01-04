package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AccountService accountservice = new AccountServiceImpl();
		System.out.println("Account로 진입");
		String cmd = request.getParameter("cmd");
		cmd = (cmd==null) ? "move": cmd;
		String dir = request.getParameter("dir");
		dir = (dir==null)? request.getServletPath().substring(1, request.getServletPath().indexOf('.')): dir ;
		String page = request.getParameter("page");
		page = (page==null)? "main":page;
		System.out.println(dir);
		System.out.println(page);
		switch(cmd) {
		case "move" :
			Command.move(request, response, dir,page);
			break;
		case "open-account" :
			System.out.println("account-open으로 진입한드아");
			String money = request.getParameter("money");
			String accNum =  accountservice.openAccountNum(Integer.parseInt(money));
			AccountBean acc = accountservice.listAccountNum(accNum);
			request.setAttribute("acc",acc);
			request.setAttribute("compo", "acc-success");
			Command.move(request, response, dir, page);
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
