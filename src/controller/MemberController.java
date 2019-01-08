package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberService memberService = MemberServiceImpl.getInstance();
		MemberBean member = null;
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
			String dest = request.getParameter("dest");
			dest = (dest==null)? "NONE": dest;
			request.setAttribute("dest", dest);
			Command.move(request, response, dir,page);
			break;
		case "join" :
			request.setAttribute("dest", "mypage");
			member = new MemberBean();
			id = request.getParameter("id");
			member.setId(id);
			String name  = request.getParameter("name");
			member.setName(name);
			pass = request.getParameter("pass");
			member.setPass(pass);
			String ssn = request.getParameter("ssn");
			member.setSsn(ssn);
			memberService.createMember(member);
			member = memberService.findId(id);
			request.setAttribute("member", member);
			Command.move(request, response, dir,page);
			break;
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
