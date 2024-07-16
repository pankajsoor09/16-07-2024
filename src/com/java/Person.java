package com.java;

public class Person {

	private int id;
	private String name;
	private String dob;
	
	public Person(int id, String name, String dob) {
		
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	public Person() {
		id=1000;
		name= "Tanmay";
		dob = "12 sept 2001";
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	
}
