package service;

import java.util.ArrayList;
import dao.MemberDaoImpl;
import domain.MemberBean;

public class MemberServiceImpl implements MemberService{
	
	private static MemberServiceImpl instance = new MemberServiceImpl();
	private MemberServiceImpl() { dao = MemberDaoImpl.getInstance();}
	public static MemberServiceImpl getInstance() {return instance;}
	MemberDaoImpl dao;
	@Override
	public void createMember(MemberBean member) {
		System.out.println("멤버 서비스임플로 들어옴");
		System.out.println("컨트롤러에서 넘어온 정보");
		System.out.println("ID" + member.getId());
		System.out.println("name"+member.getName());
		dao.insertMember(member);
	}

	@Override
	public ArrayList<MemberBean> findAllMembers() {
		ArrayList<MemberBean> list = new ArrayList<>();
		list = dao.selectAllMembers();
		return list;
	}

	@Override
	public ArrayList<MemberBean> findMembersByName(String name) {
		ArrayList<MemberBean> list = new ArrayList<>();
		list = dao.selectMembersByName();
		return list;
	}

	@Override
	public MemberBean findMembersById(String id) {
		MemberBean member = dao.selectMemberById(id);
		return member;
	}

	@Override
	public String countMember() {
		String count="";
		count = dao.CountMembers();
		return count;
	}
	
	@Override
	public boolean existMember(String id,String pass) {
		boolean exist = true;
		exist = dao.existMember();
		return exist;
	}

	@Override
	public void changeMember(MemberBean member) {
		dao.updateMember(member);
	}

	@Override
	public void remoneId(String id,String pass) {
		dao.deleteMember(id, pass);
	}
}
