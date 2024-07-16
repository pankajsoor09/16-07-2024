package com.java;

public class PersonTest {

	public static void main(String[] args) {

		   Person per = new Person(142,"Anil","28 Sept 2002");
		   
		   System.out.println(" Person Details : ");
			System.out.println("Id : "+per.getId());
			System.out.println("Name : "+per.getName());
	        System.out.println("Salary :"+per.getDob());
	        
	        System.out.println();
	        
	        Person per1 = new Person();
	        System.out.println(" wDefault Person Details : ");
			System.out.println("Id : "+per1.getId());
			System.out.println("Name : "+per1.getName());
	        System.out.println("Salary :"+per1.getDob());
	        
	        System.out.println();	   
		
	}

}
