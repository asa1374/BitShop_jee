package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	//CRUD
	public void createAccountNum(int money);
	public ArrayList<AccountBean> list();
	public AccountBean listAccountNum(String AccountNum);
	public String accountCount();
	public void updateDeposit(String account,int money);
	public void updateWidthraw(String account,int money);
	public void deleteAccount(String account);
}
