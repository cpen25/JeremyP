package com.trial.jeremyp.demo.entity;

import lombok.Data;

@Data
public class Employee {

    private Long id;
    private String employeeName;
    private String employeeAddress;
    private String mobileNumber;

    public Employee(String employeeName, String mobileNumber) {
        this.employeeName = employeeName;
        this.mobileNumber = mobileNumber;
    }

    public Employee() {
    }
}
