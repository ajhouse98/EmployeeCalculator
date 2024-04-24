package com.pluralsight;

public class EmployUserInput {
    private int employeeId;
    private String name;
    private double hoursWorked;
    private double payRate;

    public EmployUserInput(int employeeId, String name, double hoursWorked, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getGrossPay() {
        return hoursWorked * payRate;
        // System.out.println(getGrossPay);
//        System.out.printf("""
//
//                Your id is %d, your name is %s, your hours worked are %.2f, your payrate is %.2f,
//                your gross pay for this week is %.2f:
//                  """, employeeId, name, hoursWorked, payRate, getGrossPay);
//        System.out.println("Your id is " + employeeId + "your name " + name +
//                "your hours worked are " + hoursWorked + "your payrate is " + payRate +
//                "your gross pay for this week is: " + getGrossPay);
    }
}
