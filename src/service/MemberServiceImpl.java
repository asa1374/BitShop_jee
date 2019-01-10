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
		return dao.selectMemberById(id);
	}

	@Override
	public String countMember() {
		String count="";
		count = dao.CountMembers();
		return count;
	}
	
	@Override
	public boolean existMember(String id,String pass) {
		boolean loginOk = false;
		MemberBean bean = new MemberBean();
		bean = dao.existMember(id,pass);
		if(bean != null &&id.equals(bean.getId()) && pass.equals(bean.getPass())) {
			loginOk = true;
		}
		return loginOk;
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
