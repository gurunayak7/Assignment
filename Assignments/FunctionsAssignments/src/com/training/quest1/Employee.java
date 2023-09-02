package com.training.quest1;

public class Employee {
	private String name;
    private int employeeID;
    private String city;

    public Employee(String name, int employeeID, String city) {
        this.name = name;
        this.employeeID = employeeID;
        this.city = city;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", employeeID=" + employeeID + ", city=" + city + "]";
    }
}
