package com.banking.app.staff;

import com.banking.app.customer.Branch;

public class Manager extends Employee {
    public Manager(String name, int experience, Branch branch) {
        super(name, experience, branch);
    }

    public void managerDetails() {
        System.out.println("\nManager Details:");
        employeeDetails();
    }
}
