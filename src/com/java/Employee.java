package com.java;

public class Employee {
    
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id,String name,double salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
		System.out.println("Parameterized ");
		
	}
	
	public Employee() {
		id = 110;
	    name = "soor";
	    salary = 140000.00;
	    System.out.println("Default");
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

}



