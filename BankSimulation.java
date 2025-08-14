package com.test;

import java.util.Scanner;

import com.dao.SavinAccount;
import com.pojo.Account;

public class BankSimulation {
	public static void showChoice() {
		System.out.println("\n--------------Bank Menu LIST----------");
		System.out.println("|   1 Deposi Amoount   |");
		System.out.println("|   2 Withdraw Amount  |");
		System.out.println("|   3 Show Balance     |");
		System.out.println("|   4 Show Transectiones |");
		System.out.println("|   5 Exit |");
		System.out.println("-----   Enter the choice ---------");
	}
public static void main(String[]args) {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Enter the AccountHolder Name");
	String name=scanner.next();
	System.out.println("Enter the Depositing amount");
	double ammount=scanner.nextDouble();
	Account account=new SavinAccount(name, ammount, 1.5);
	int choice;
	do {
		BankSimulation.showChoice();
		choice=scanner.nextInt();
		switch(choice) {
		case 1:
				System.out.println("Enter the deposit ammount");
				account.deposit(scanner.nextDouble());
				break;
		case 2:
				System.out.println("Enter the withdraw ammount");
				account.withdraw(scanner.nextDouble());
				break;
		case 3:
				account.showBalance();
				break;
		case 4:
				account.showTransectionHistory();
				break;
		case 5:
			System.out.println("Thank you for banking with us!");
            break;
		default:
            System.out.println("Invalid option. Try again.");
		}
		
	}while(choice !=5);
	scanner.close();
}
}
