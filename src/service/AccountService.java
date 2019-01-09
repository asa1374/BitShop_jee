package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	//CRUD
	public void openAccountNum(int money);
	public String createAccountNum();
	public ArrayList<AccountBean> findAllAccounts();
	public AccountBean findByAccountNum(String accountNum);
	public String countAccount();
	public String date();
	public void changeDeposit(String account,int money);
	public void changeWidthraw(String account,int money);
	public void removeAccount(String account);
}
