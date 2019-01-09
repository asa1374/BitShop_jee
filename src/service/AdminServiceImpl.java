package service;
import java.util.ArrayList;

import dao.AdminDaoImpl;
import domain.AdminBean;

public class AdminServiceImpl implements AdminService{
	private static AdminServiceImpl instance = new AdminServiceImpl();
	private AdminServiceImpl() {
		dao = AdminDaoImpl.getInstance();
	}
	public static AdminServiceImpl getInstance() {return instance;}
	AdminDaoImpl dao;

	@Override
	public void createEmployee(AdminBean admin) {
		dao.insertEmployee(admin);
	}

	@Override
	public ArrayList<AdminBean> findEmployeeAll() {
		ArrayList<AdminBean> list = dao.selectEmployeeAll();
		return list;
	}

	@Override
	public ArrayList<AdminBean> findByName(String name) {
		ArrayList<AdminBean> list = dao.selectEmployeeByName(name);
		return list;
	}

	@Override
	public AdminBean findByEmployeeNum(String employeeNum) {
		AdminBean bean = dao.selectByEmployeeNum(employeeNum);
		return bean;
	}

	@Override
	public String countEmployee() {
		String count = dao.countEmployee();
		return count;
	}

	@Override
	public void changeAuth(String EmployeeNum) {
		dao.updateAuth(EmployeeNum);
	}

	@Override
	public void removeEmployeeNum(String EmployeeNum) {
		dao.deleteEmployee(EmployeeNum);
	}

}
