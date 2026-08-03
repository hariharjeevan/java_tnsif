package com.vviet.bankaccount;

public class BankAccount {
	int accountNumber;
	double balance;

	public BankAccount(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public void Balance() {
		System.out.println("Balance: ₹ " + balance);
	}

	public void Deposit(double depositAmount) {
		try {
			if (depositAmount <= 0) {
				throw new InvalidAmountException("The amount enetered is ₹ " + depositAmount + ", which is Invalid!");
			} else {
				balance += depositAmount;
			}
		} catch (InvalidAmountException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

	public void Withdrawal(double withdrawalAmount) {
		try {
			if (balance < withdrawalAmount) {
				throw new InsufficientFundsException(
						"Withdrawal Failed. Requested amount: ₹ " + withdrawalAmount + ". But Balance is: ₹ " + balance);
			} else {
				balance -= withdrawalAmount;
			}
		} catch (InsufficientFundsException e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
