package com.chris.oscjp.chapter9;

public class DepositAccount {
	private int balance = 0;
	
	public void addDeposit(int amount){
		balance += amount;
	}
	public int getBalance(){
		return balance;
	}
	
}
