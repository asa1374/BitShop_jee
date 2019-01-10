package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDao {
	public void insertMember(MemberBean member);
	public ArrayList<MemberBean> selectAllMembers();
	public ArrayList<MemberBean> selectMembersByName();
	public MemberBean selectMemberById(String id);
	public String CountMembers();
	public MemberBean existMember(String id,String pass);
	public void updateMember(MemberBean member);
	public void deleteMember(String id,String pass);
}
