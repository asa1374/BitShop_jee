package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import dao.AccountDaoImpl;
import domain.AccountBean;

public class AccountServiceImpl implements AccountService{
	private static AccountServiceImpl instance = new AccountServiceImpl();
	private AccountServiceImpl() {
		list = new ArrayList<>();
		dao = AccountDaoImpl.getInstance();
	}
	private ArrayList<AccountBean> list;
	AccountDaoImpl dao; 
	public static AccountServiceImpl getInstance() {
		return instance;
	}

	@Override
	public void openAccountNum(int money) {
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(date());
		list.add(account);
		dao.insertAccount(account);
	}
	@Override
	public String createAccountNum() {
		Random random = new Random();
		return random.nextInt(8999)+1001+"";
	}
	@Override
	public String date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
		return sdf.format(date);
	}
	@Override

	public ArrayList<AccountBean> findAllAccounts() {
		ArrayList<AccountBean> list = dao.selectAllAccounts();
		return list;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean account = dao.selectAccountByAccountNum(accountNum);
		for(int i=0;i<list.size();i++) {
			if(accountNum.equals(list.get(i).getAccountNum())) {
				account = list.get(i);
				break;
			}
		}
		return account;
	}

	@Override
	public String countAccount() {
		String count = dao.countAccount();
		return count;
	}

	@Override
	public void changeDeposit(String account, int money) {
		dao.updateDeposit(money);
		
	}

	@Override
	public void changeWidthraw(String account, int money) {
		dao.updateWidthraw(money);
		
	}

	@Override
	public void removeAccount(String account) {
		dao.deleteAccount(account);
		
	}
}
