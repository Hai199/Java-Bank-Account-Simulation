package com.dao;

import com.pojo.Account;
//Inheriting the other class and overriding method
public class SavinAccount extends Account{
private double intrestrate;
	public SavinAccount(String accountholder, double initialBalance,double intrestrate) {
		super(accountholder, initialBalance);
		this.intrestrate=intrestrate;
	}
	@Override
	public void deposit(double amount) {
		super.deposit(amount);
		double intrest=(amount*intrestrate)/100;
		balance+=intrest;
		transectionhistory.add("Intrestrate added: "+intrest+"  Balance :"+balance);
	}

}
