package com.pojo;

import java.util.ArrayList;
import java.util.List;
//Base Account Class
public class Account {

	protected String accountholder;
	protected double balance;
	protected List<String> transectionhistory;
	//Constructor
	public Account(String accountholder,double initialBalance) {
		this.accountholder=accountholder;
		this.balance=initialBalance;
		this.transectionhistory=new ArrayList<>();
		transectionhistory.add("Account created with initialBalance: "+initialBalance);
	}
	// Methods
	public void deposit(double amount) {
		if(amount>0) {
			balance+=amount;
			transectionhistory.add("Deposited amount: "+amount +"  Balance: "+balance);
			System.out.println("Amount deposited successfully! Current Balance: "+balance);
		}else {
			System.out.println("Deposited ammount must positive");
		}
	}
	public void withdraw(double ammount) {
		if(ammount>0==ammount<=balance) {
			balance-=ammount;
			transectionhistory.add("withdrawn ammount: "+ammount +"   Balance: "+balance);
			System.out.println("Ammount withdrawn successfully! Current Balance: "+balance);
		}else {
			System.out.println("Insuficient Balance! or invalid ammount");
		}
	}
	public void showTransectionHistory() {
		System.out.println("\n Transection history for: "+accountholder);
		for(String history:transectionhistory) {
			System.out.println(history);
		}
	}
	public void showBalance() {
		System.out.println("Account Balance: "+balance);
	}
}
