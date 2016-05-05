package com.chris.oscjp.chapter9;

public class BankDeposit implements Runnable{
	private DepositAccount depAcc = new DepositAccount();
	final int MAX_BALANCE = 100;
	
	public void run(){
		for(int i = 0;i < 10;i++){
			makeDeposit(10);
		}
	}
	public void makeDeposit(int amount){
		System.out.println(" Before deposit Balance = " + depAcc.getBalance());
		if(depAcc.getBalance() < MAX_BALANCE){
			System.out.println("In if statement Thread is " + Thread.currentThread().getName());
			try {
				Thread.sleep(500);
				} catch(InterruptedException ex) {
				ex.printStackTrace();
			}
			depAcc.addDeposit(amount);
			System.out.println("Deposit made by " + Thread.currentThread().getName());
			System.out.println("Balance = " + depAcc.getBalance());
		}
		else {
			System.out.println("Thread is " + Thread.currentThread().getName());
			System.out.println("Deposit cannot be made. Balance = " + depAcc.getBalance());
		}
	}
	public static void main(String[] args){
		BankDeposit bd = new BankDeposit();
		Thread trump = new Thread(bd);
		trump.setName("Donald Trump");
		Thread rockefeller = new Thread(bd);
		rockefeller.setName("rockefeller");
		trump.start();
		rockefeller.start();
	}
}
