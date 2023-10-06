package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class School {
	private List<Student> studentRoster;
	private List<Person> personRoster;

	public School() {
		studentRoster = new ArrayList<>();
		personRoster = new ArrayList<>();
	}

	public void addStudentToStudentList(Student student) {
		studentRoster.add(student);
	}

	public void addStudentToPersonList(Student student) {
		personRoster.add(student);
	}

	public List<Student> getStudentRoster() {
		return studentRoster;
	}

	public List<Person> getPersonRoster() {
		return personRoster;
	}

	public void sortById() {
		// student list
		Collections.sort(studentRoster, Comparator.comparingInt(Student::getId));
		// person list
		Comparator<Person> comparatorID = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if (p1 instanceof Student && p2 instanceof Student) {
					int id1 = ((Student) p1).getId();
					int id2 = ((Student) p2).getId();
					return Double.compare(id1, id2);
				}
				return 0;
			}
		};
		Collections.sort(personRoster, comparatorID);
	}

	public void sortByAge() {
		// student list
		Collections.sort(studentRoster, Comparator.comparingInt(Student::getAge));
		// person list
		Comparator<Person> comparatorAge = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				int age1 = p1.getAge();
				int age2 = p2.getAge();
				return Integer.compare(age1, age2);
			}
		};
		Collections.sort(personRoster, comparatorAge);
	}

	public void sortByLastName() {
		// student list
		Collections.sort(studentRoster, Comparator.comparing(Student::getLastName));
		// person list
		Comparator<Person> comparatorLastName = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				String lastName1 = p1.getLastName();
				String lastName2 = p2.getLastName();
				return lastName1.compareToIgnoreCase(lastName2);
			}
		};
		Collections.sort(personRoster, comparatorLastName);
	}

	public void sortByGPA() {
		// student list
		Collections.sort(studentRoster, Comparator.comparingDouble(Student::getGpa).reversed());
		// person list
		Comparator<Person> comparatorGPA = new Comparator<Person>() {
			@Override
			public int compare(Person p1, Person p2) {
				if (p1 instanceof Student && p2 instanceof Student) {
					double gpa1 = ((Student) p1).getGpa();
					double gpa2 = ((Student) p2).getGpa();
					return Double.compare(gpa2, gpa1);
				}
				return 0;
			}
		};
		Collections.sort(personRoster, comparatorGPA);
	}

}