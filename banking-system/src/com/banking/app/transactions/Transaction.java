package com.banking.app.transactions;

import com.banking.app.customer.BankAccount;

public class Transaction {
    public double amount;
    public String type;
    public BankAccount account;

    public Transaction(double amount, String type, BankAccount account) {
        this.amount = amount;
        this.type = type;
        this.account = account;
    }

    public void transactionDetails() {
        System.out.println("\nTransaction Type: " + this.type);
        System.out.println("Transaction Amount: " + this.amount);
        System.out.println("Account ID: " + this.account.id);
    }
}
