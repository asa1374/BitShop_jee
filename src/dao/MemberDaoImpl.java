package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import domain.MemberBean;

public class MemberDaoImpl implements MemberDao{
	
	private static MemberDaoImpl instance = new MemberDaoImpl();
	private MemberDaoImpl() {}
	public static MemberDaoImpl getInstance() {return instance;}
	private Connection conn;
	private Statement stmt;
	private ResultSet rs;
	
	@Override
	public void insertMember(MemberBean member) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("INSERT INTO member(id,name,pass,ssn) \n"
					+ "VALUES('%s','%s','%s','%s')", 
					member.getId(),member.getName(),member.getPass(),member.getSsn());
			System.out.println("SQL ::::" + sql);
			//rs = stmt.executeQuery(sql);
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("성공");
			}else {
				System.out.println("실패");
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<MemberBean> selectMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<MemberBean> selectByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberBean selectById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String memberCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existMember() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void updatePass() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteId() {
		// TODO Auto-generated method stub
		
	}

}
