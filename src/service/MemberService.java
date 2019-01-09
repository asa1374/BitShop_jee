package service;

import java.util.ArrayList;
import domain.MemberBean;

public interface MemberService {
	public void createMember(MemberBean member);
	public ArrayList<MemberBean> findAllMembers();
	public ArrayList<MemberBean> findMembersByName(String name);
	public MemberBean findMembersById(String id);
	public String countMember();
	public boolean existMember(String id,String pass);
	public void changeMember(MemberBean member);
	public void remoneId(String id,String pass);
}
