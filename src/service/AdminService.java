package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	//CRUD
	public void createEmployee(String adminNum,String name,String pass,String auth);
	public ArrayList<AdminBean> list();
	public ArrayList<AdminBean> findName(String name);
	public AdminBean findEmployeeNum(String adminNum);
	public String employeeCount();
	public void updateAuth(String adminNum);
	public void deleteEmployeeNum(String adminNum,String pass);
}
