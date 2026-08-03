package com.vviet.bankaccount;

public class Main {

	public static void main(String[] args) {
		BankAccount account = new BankAccount(001, 50000);
		// Initial balance
		account.Balance();

		// Check deposit and withdraw methods
		System.out.println("Deposit: ₹ 30000");
		account.Deposit(30000);
		account.Balance();
		System.out.println("Withdraw: ₹ 30000");
		account.Withdrawal(30000);
		account.Balance();

		// InsufficientFunds custom exception demo
		account.Withdrawal(50001);
		// InvalidAmount custom exception demo
		account.Deposit(0);
	}

}
