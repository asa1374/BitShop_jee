package dao;

import java.util.ArrayList;

import domain.MemberBean;

public interface MemberDao {
	public void createMember();
	public ArrayList<MemberBean> selectMembers();
	public ArrayList<MemberBean> selectByName();
	public MemberBean selectById();
	public String memberCount();
	public boolean existMember();
	public void updatePass();
	public void deleteId();
}
