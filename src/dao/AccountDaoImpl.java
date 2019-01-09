package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import domain.AccountBean;
import pool.Constant;

public class AccountDaoImpl implements AccountDao{
	private static AccountDaoImpl instance = new AccountDaoImpl();
	private AccountDaoImpl() {}
	public static AccountDaoImpl getInstance() {return instance;}
	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	@Override
	public void insertAccount(AccountBean account) {
		try {
			Class.forName(Constant.ORACLE_DRIVER);
			conn = DriverManager.getConnection(Constant.ORACLE_URL,Constant.USERNAME,Constant.PASSWORD);
			stmt = conn.createStatement();
			String sql = String.format("", "");
			int a = stmt.executeUpdate(sql);
			if(a==1) {
				System.out.println("계좌 등록 성공");
			}else {
				System.out.println("계좌 등록 실패");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ArrayList<AccountBean> selectAllAccounts() {
		ArrayList<AccountBean> accountBeans = new ArrayList<>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("","");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountBeans;
	}

	@Override
	public AccountBean selectAccountByAccountNum(String accountNum) {
		AccountBean accountBean = new AccountBean();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return accountBean;
	}

	@Override
	public String countAccount() {
		String count = "";
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public boolean existAccountNum(String account) {
		boolean exist = true;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return exist;
	}

	@Override
	public void updateDeposit(int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateWidthraw(int money) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("","");
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteAccount(String accountNum) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","oracle", "password");
			stmt = conn.createStatement();
			String sql = String.format("", "");
			stmt.executeUpdate(sql);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
