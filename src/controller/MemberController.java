package controller;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import command.Command;
import domain.MemberBean;
import service.MemberServiceImpl;
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		MemberBean member = null;
		System.out.println("멤버 서블릿으로 들어옴");
		String cmd = request.getParameter("cmd");
		cmd = (cmd==null) ? "move": cmd;
		String dir = request.getParameter("dir");
		dir = (dir==null)? request.getServletPath().substring(1, request.getServletPath().indexOf('.')): dir ;
		String page = request.getParameter("page");
		page = (page==null)? "main":page;
		String dest = request.getParameter("dest");
		dest = (dest==null)? "NONE":dest;
		switch(cmd) {
		case "login" :
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");
			System.out.println("아이디 : "+id + "비번 : " + pass);
			if(MemberServiceImpl.getInstance().existMember(id, pass)) {
				request.setAttribute("member", MemberServiceImpl.getInstance().findMembersById(id));
				request.setAttribute("dest", dest);
				System.out.println("로긍니 성공");
			}else{
				System.out.println("로그인 실패");
				dir = "";
				page="index";
			}
			break;
		case "move" :
			dest = request.getParameter("dest");
			request.setAttribute("dest", dest);
			break;
		case "join" :
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			MemberServiceImpl.getInstance().createMember(member);
			member = MemberServiceImpl.getInstance()
					.findMembersById(member.getId());
			request.setAttribute("dest", request.getParameter("dest"));
			request.setAttribute("member", member);
			break;
		case "logout" :
			dir = "";
			page="index";
			dest = "";
			break;
		case "findAll" :
			MemberServiceImpl.getInstance().findAllMembers();
			break;
		case "findByName" :
			String name = request.getParameter("name");
			MemberServiceImpl.getInstance().findMembersByName(name);
			break;
		case "findById" :
			id = request.getParameter("id");
			MemberServiceImpl.getInstance().findMembersById(id);		
			break;
		case "countMember" :
			MemberServiceImpl.getInstance().countMember();
			break;
		case "changeMember" :
			MemberServiceImpl.getInstance().changeMember(member);
			break;
		case "removeMember" :
			id = request.getParameter("id");
			pass = request.getParameter("pass");
			MemberServiceImpl.getInstance().remoneId(id, pass);
			break;
		}
		Command.move(request, response, dir,page);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
