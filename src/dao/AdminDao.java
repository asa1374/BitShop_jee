package dao;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminDao {
	public void insertEmployee(AdminBean admin);
	public ArrayList<AdminBean> selectEmployeeAll();
	public ArrayList<AdminBean> selectEmployeeByName(String name);
	public AdminBean selectByEmployeeNum(String employeeNum);
	public String countEmployee();
	public void updateAuth(String EmployeeNum);
	public void deleteEmployee(String EmployeeNum);

}
