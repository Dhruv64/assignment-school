package edu.neu.csye6200;

class Student extends Person {
	private double gpa;
	private String major;

	public Student(int id, String firstName, String lastName, int age, double gpa, String major) {
		super(id, firstName, lastName, age);
		this.gpa = gpa;
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public String getMajor() {
		return major;
	}

	@Override
	public String toString() {
		return super.toString() + ", GPA: " + gpa + ", Major: " + major;
	}
}