package edu.neu.csye6200;

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");

		School school = new School();
		// Add 5 students to each list
		school.addStudentToStudentList(new Student(1, "Dhruv", "Parmar", 20, 3.5, "Computer Science"));
		school.addStudentToStudentList(new Student(2, "Henil", "Gajjar", 22, 3.9, "Engineering"));
		school.addStudentToStudentList(new Student(3, "Dhruv", "Miyani", 19, 3.7, "Mathematics"));
		school.addStudentToStudentList(new Student(4, "Dhruv", "Patel", 21, 3.2, "Biology"));
		school.addStudentToStudentList(new Student(5, "Saloni", "Khanchandani", 23, 3.8, "Physics"));
		school.addStudentToPersonList(new Student(6, "Hardi", "Patel", 25, 3.6, "Computer Science"));
		school.addStudentToPersonList(new Student(7, "Elon", "Musk", 23, 3.3, "Engineering"));
		school.addStudentToPersonList(new Student(8, "Alay", "Patel", 28, 3.4, "Mathematics"));
		school.addStudentToPersonList(new Student(9, "Sarjesh", "Shah", 26, 3.5, "Biology"));
		school.addStudentToPersonList(new Student(10, "Anagha", "Aacharya", 27, 3.8, "Physics"));
		 
		// id
		System.out.println("\nSorted by ID");
		school.sortById();
		System.out.println("\nStudent List");
		school.getStudentRoster().stream().forEach(s -> System.out.println(s.toString()));
		System.out.println("\nPerson List");
		school.getPersonRoster().stream().forEach(s -> System.out.println(s.toString()));

		//age
		System.out.println("\nSorted by age");
		school.sortByAge();
		System.out.println("\nStudent List");
		school.getStudentRoster().stream().forEach(s -> System.out.println(s.toString()));
		System.out.println("\nPerson List");
		school.getPersonRoster().stream().forEach(s -> System.out.println(s.toString()));

		//last name
		System.out.println("\nSorted by last name");
		school.sortByLastName();
		System.out.println("\nStudent List");
		school.getStudentRoster().stream().forEach(s -> System.out.println(s.toString()));
		System.out.println("\nPerson List");
		school.getPersonRoster().stream().forEach(s -> System.out.println(s.toString()));

		//gpa
		System.out.println("\nSorted by GPA in descending order");
		school.sortByGPA();
		System.out.println("\nStudent List");
		school.getStudentRoster().stream().forEach(s -> System.out.println(s.toString()));
		System.out.println("\nPerson List");
		school.getPersonRoster().stream().forEach(s -> System.out.println(s.toString()));

		System.out.println("\n\n============Main Execution End===================");
	}

}