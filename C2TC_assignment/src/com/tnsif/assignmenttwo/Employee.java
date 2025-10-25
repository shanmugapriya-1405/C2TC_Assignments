package com.tnsif.assignmenttwo;

public class Employee {
	private String name;
    private String employeeId;
    private double salary;

    // Default constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Name: " + name + ", ID: " + employeeId + ", Salary: " + salary);
    }

}