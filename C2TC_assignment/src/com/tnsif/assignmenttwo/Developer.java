package com.tnsif.assignmenttwo;

public class Developer extends Employee {
    private String project;

    public Developer() {}

    public Developer(String name, String employeeId, double salary, String project) {
        super(name, employeeId, salary);
        this.project = project;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Project: " + project);
    }

}
