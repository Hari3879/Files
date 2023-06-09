package com.ojas.spring.model;

import org.springframework.stereotype.Component;

@Component
public class People {

	private int id;
	private int age;
	private String firstName;
	private String lastName;

	public People() {
	}

	public People(int id, int age, String firstName, String lastName) {
		this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String toString() {
		return id + "\t" + firstName + "\t" + lastName + "\t" + age;
	}

}
