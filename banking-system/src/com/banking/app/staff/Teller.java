package com.banking.app.staff;

import com.banking.app.customer.Branch;

public class Teller extends Employee {
    public Teller(String name, int experience, Branch branch) {
        super(name, experience, branch);
    }

    public void tellerDetails() {
        System.out.println("\nTeller Details:");
        employeeDetails();
    }
}
