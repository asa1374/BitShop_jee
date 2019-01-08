package service;

import java.util.ArrayList;

import dao.MemberDaoImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstance() {return instance;}

	@Override
	public void createMember(MemberBean member) {
		System.out.println("멤버 서비스임플로 들어옴");
		System.out.println("컨트롤러에서 넘어온 정보");
		System.out.println("ID" + member.getId());
		System.out.println("name"+member.getName());
		MemberDaoImpl.getInstance().insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> list() {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public MemberBean findId(String id) {
		MemberBean member = new MemberBean();
		
		return member;
	}

	@Override
	public String memberCount() {
		String count="";
		return count;
	}
	
	@Override
	public boolean existMember() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass(String id, String pass, String newpass) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteId(String id) {
		// TODO Auto-generated method stub
		
	}
}
