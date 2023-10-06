package edu.neu.csye6200;

public class Person {
	private int id;
	private String firstName;
	private String lastName;
	private int age;

	public Person(int id, String firstName, String lastName, int age) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + firstName + " " + lastName + ", Age: " + age;
	}
}
