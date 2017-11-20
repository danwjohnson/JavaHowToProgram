package com.dan.training.java.chap3;

/*
 * Assignment:
 * 3.11 (Modified Account Class) Modify class Account (Fig. 3.8 ) to provide 
 * a method called withdraw that withdraws money from an Account. Ensure that 
 * the withdrawal amount does not exceed the Account’s balance. If it does, 
 * the balance should be left unchanged and the method should print a message 
 * indicating "Withdrawal amount exceeded account balance." Modify class 
 * AccountTest (Fig. 3.9 ) to test method withdraw.
 */

// Account class with double instance variable balance and a constructor
// and deposit method that performs validation

public class Account {

	private String name;				// instance variable
	private double balance;			// instance variable
	
	// Account constructor that receives two parameters
	public Account(String name, double balance) {
		
		this.name = name	;			// Assign the name to instance variable name
		
		// validate that the balance is 0.0; if its not,
		// instance variable balance keeps its default initial value of 0.0
		if (balance > 0.0) {
			this.balance = balance;
		}
		
	}
	
	// method that deposits (adds) only a valid amount to balance
	public void deposit(double depositAmount) {
		
		if (depositAmount > 0.0) {					// if deposit amount is valid
			balance = balance + depositAmount;    	// add it to the balance
		}
		
	}
	
	// method that deposits (subtracts) an amount from the balance.
	public void withdraw(double withdrawAmount) {
		
		if (withdrawAmount > 0.0) {
			if (withdrawAmount > balance) {
				System.out.println("Withdrawal amount is greater than the balance.");
			} else {
				balance = balance - withdrawAmount;
			}
		} else {
			System.out.println("Invalid withdrawal ammount.");
		}
		
	}
	
	// method returns the account balance
	public double getBalance() {
		
		return balance;
		
	}
	
	// method that sets the name
	public void setName(String name) {
		this.name = name;
	}
	
	// method that gets the name
	public String getName() {
		return name;
	}
	
}
