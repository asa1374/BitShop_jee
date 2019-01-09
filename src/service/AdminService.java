package service;

import java.util.ArrayList;

import domain.AdminBean;

public interface AdminService {
	//CRUD
	public void createEmployee(AdminBean admin);
	public ArrayList<AdminBean> findEmployeeAll();
	public ArrayList<AdminBean> findByName(String name);
	public AdminBean findByEmployeeNum(String employeeNum);
	public String countEmployee();
	public void changeAuth(String EmployeeNum);
	public void removeEmployeeNum(String EmployeeNum);
}
