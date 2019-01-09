package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDao {
	//CRUD
	public void insertAccount(AccountBean account);
	public ArrayList<AccountBean> selectAllAccounts();
	public AccountBean selectAccountByAccountNum(String accountNum);
	public String countAccount();
	public boolean existAccountNum(String account);
	public void updateDeposit(int money);
	public void updateWidthraw(int money);
	public void deleteAccount(String accountNum);
}
