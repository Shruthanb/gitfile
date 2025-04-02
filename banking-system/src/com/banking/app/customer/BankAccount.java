package com.banking.app.customer;

public class BankAccount {
    public int id;
    public Branch[] branches;

    public BankAccount(int id, Branch[] branches) {
        this.id = id;
        this.branches = branches;
    }

    public void bankAccountDetails() {
        System.out.println("\nBank Account ID: " + this.id);
        System.out.println("Branches:");
        for (Branch branch : branches) {
            branch.branchDetails();
        }
    }
}
