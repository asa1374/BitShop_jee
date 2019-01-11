package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import domain.MemberBean;
import factory.DatabaseFactory;

public class MemberDaoImpl implements MemberDao{
	
	private static MemberDaoImpl instance = new MemberDaoImpl();
	private MemberDaoImpl() {}
	public static MemberDaoImpl getInstance() {return instance;}
	
	@Override
	public void insertMember(MemberBean member) {
		try {
			DatabaseFactory
				.createDatabase("oracle")
				.getConnection()
				.createStatement()
				.executeUpdate(
						String.format("INSERT INTO member(id, name, pass, ssn)\n"
								+"VALUES('%s', '%s', '%s', '%s')",
								member.getId(),member.getName(),
								member.getPass(),member.getSsn()));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectAllMembers() {
		ArrayList<MemberBean> arrayList = new ArrayList<>();
		return arrayList;
	}

	@Override
	public ArrayList<MemberBean> selectMembersByName() {
		ArrayList<MemberBean> arrayList = new ArrayList<>();
		return arrayList;
	}

	@Override
	public MemberBean selectMemberById(String id) {
		MemberBean member = null;
		try {
			ResultSet rs = DatabaseFactory
				.createDatabase("oracle")
				.getConnection()
				.createStatement()
				.executeQuery(String.format("SELECT * FROM member\n" 
						+"WHERE id LIKE '%s'", id));
			while(rs.next()) {
				member = new MemberBean();
				member.setId(rs.getString("id"));
				member.setName(rs.getString("name"));
				member.setPass(rs.getString("pass"));
				member.setSsn(rs.getString("ssn"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return member;
	}

	@Override
	public String CountMembers() {
		String count = "";
		
		return count;
	}

	@Override
	public MemberBean existMember(String id, String pass) {
		MemberBean bean = null;
		try {
			ResultSet rs = DatabaseFactory.createDatabase("oracle").getConnection()
				.createStatement().executeQuery(String.format("SELECT * FROM member\n" + 
						"WHERE id LIKE '%s' AND pass LIKE '%s'", id,pass));
			while(rs.next()) {
				bean = new MemberBean();
				bean.setId(rs.getString("id"));
				bean.setName(rs.getString("name"));
				bean.setPass(rs.getString("pass"));
				bean.setSsn(rs.getString("ssn"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return bean;
	}

	@Override
	public void updateMember(MemberBean member) {
	}

	@Override
	public void deleteMember(String id,String pass) {
	}
}
