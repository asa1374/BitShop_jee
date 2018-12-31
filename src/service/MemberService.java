package service;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberService {
	public void createMember(String id,String name,String pass,String ssn);
	public ArrayList<MemberBean> list();
	public ArrayList<MemberBean> findName(String name);
	public MemberBean findId(String id);
	public String memberCount();
	public void updatePass(String id,String pass, String newpass);
	public void deleteId(String id);
}
