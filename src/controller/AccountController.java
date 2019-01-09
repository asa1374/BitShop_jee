package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import command.Command;
import domain.AccountBean;
import service.AccountServiceImpl;

@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			String dest = request.getParameter("dest");
			System.out.println("dest =====" + dest);
			dest = (dest==null)? "NONE": dest;
			request.setAttribute("dest", dest);
			Command.move(request, response, dir,page);
			break;
		case "open-account" :
			System.out.println("account-open으로 진입한드아");
			dest = request.getParameter("dest");
			dest = (dest==null)? "open-result": dest;
			request.setAttribute("dest", dest );
			String money = request.getParameter("money");
			AccountServiceImpl.getInstance().openAccountNum(Integer.parseInt(money));
			AccountBean acc = AccountServiceImpl.getInstance().findByAccountNum("");
			request.setAttribute("acc",acc);
			request.setAttribute("compo", "acc-success");
			System.out.println("컨트롤러 에서 경로"+dir+page);
			Command.move(request, response, dir, page);
			break;
		case "findAll" :
			AccountServiceImpl.getInstance().findAllAccounts();
			break;
		case "findAccNum" :
			String accountNum = request.getParameter("accNum");
			AccountServiceImpl.getInstance().findByAccountNum(accountNum);
			break;
		case "countAcc" :
			AccountServiceImpl.getInstance().countAccount();
			break;
		case "changeDiposit" :
			accountNum = request.getParameter("accNum");
			money = request.getParameter("money");
			AccountServiceImpl.getInstance().changeDeposit(accountNum, Integer.parseInt(money));
			break;
		case "changeWidthraw" :
			accountNum = request.getParameter("accNum");
			money = request.getParameter("money");
			AccountServiceImpl.getInstance().changeWidthraw(accountNum, Integer.parseInt(money));
			break;
		case "remove" :
			accountNum = request.getParameter("accNum");
			AccountServiceImpl.getInstance().removeAccount(accountNum);
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
