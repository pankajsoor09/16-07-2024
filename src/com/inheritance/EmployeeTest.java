package com.inheritance;

public class EmployeeTest {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("Raj");
		person.setAddress("Wani");
		person.setDob("27 May 2001");
		
		System.out.println("Person Details : ");
		System.out.println("Name : "+person.getName());
		System.out.println("Address : "+person.getAddress());
		System.out.println("Date of birth : "+person.getDob());

		System.out.println("-----------------------------");
		
		Employee emp = new Employee();
		emp.setId(117);
		emp.setName("Aditya");
		emp.setDob("13 feb 2003");
		emp.setSalary(1100000.0f);
		emp.setAddress("Yavatmal");
		
		System.out.println("Employee Details : ");
		System.out.println("ID : "+emp.getId());
		System.out.println("Name : "+emp.getName());
		System.out.println("Address :"+emp.getAddress());
		System.out.println("Salary : "+emp.getSalary());
		System.out.println("Date of birth :"+emp.getDob());

		
		

		
	}

}
