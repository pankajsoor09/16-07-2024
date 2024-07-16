package com.java;

public class EmployeeTest {
	
	public static void main(String[] args) {

			Employee emp = new Employee(101,"Nayan",120000.00);//parameterized
			
			System.out.println("Employee Details : ");
			System.out.println("Id : "+emp.getId());
			System.out.println("Name : "+emp.getName());
	        System.out.println("Salary :"+emp.getSalary());
	        
	        System.out.println("--------------------------");
	        
	        emp.setId(111);
			emp.setName("Pankaj");
			emp.setSalary(1100010);
			
			System.out.println("After changing value Employee Details : ");
			System.out.println("Id : "+emp.getId());
			System.out.println("Name : "+emp.getName());
	        System.out.println("Salary :"+emp.getSalary());
	        
	        System.out.println("-------------------------------");
	        
	        Employee emp1 = new Employee();//default
	        System.out.println("Default value Employee Details : ");
			System.out.println("Id : "+emp1.getId());
			System.out.println("Name : "+emp1.getName());
	        System.out.println("Salary :"+emp1.getSalary());
	        
		}

	}


