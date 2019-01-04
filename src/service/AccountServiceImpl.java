package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import domain.AccountBean;

public class AccountServiceImpl implements AccountService{
	private ArrayList<AccountBean> list;
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}

	@Override
	public String openAccountNum(int money) {
		String accNum = "";
		AccountBean account = new AccountBean();
		account.setAccountNum(createAccountNum());
		account.setMoney(money);
		account.setToday(date());
		list.add(account);
		accNum = account.getAccountNum();
		return accNum;
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
	public ArrayList<AccountBean> list() {
		return list;
	}

	@Override
	public AccountBean listAccountNum(String accountNum) {
		AccountBean account = new AccountBean();
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getAccountNum().equals(accountNum)) {
				account = list.get(i);
			}
		}
		return account;
	}

	@Override
	public String accountCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateDeposit(String account, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateWidthraw(String account, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccount(String account) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
