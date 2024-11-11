package com.Xworks.AccessSpecifiers;

import com.Xworks.AccessSpecifiers.example.Police;

public class Bank
{
public String accountHolderName;
private double balance;
protected int accountNumber;
String branchName;

// Default constructor
 Bank() {
    this.accountHolderName = "Swathi";
    this.balance = 200000.00;
    this.accountNumber = 3694;
    this.branchName = "Udma";
}

// Private constructor
private Bank(String accountHolderName, double balance, int accountNumber, String branchName) {
    this.accountHolderName = accountHolderName;
    this.balance = balance;
    this.accountNumber = accountNumber;
    this.branchName = branchName;
}

// Public method
public void deposite(double amount) {
    if (amount > 0) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    } else {
        System.out.println("Invalid deposit amount");
    }
}

// Private method
private void setBalance(double balance) {
    this.balance = balance;
}

// Protected method
protected double getBalance() {
    return this.balance;
}
//Default method
void displayAccountDetails() {
    System.out.println("Account Holder: " + accountHolderName);
    System.out.println("Account Number: " + accountNumber);
    System.out.println("Branch Name: " + branchName);
    System.out.println("Balance: " + balance);
}
}