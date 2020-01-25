package fmi.informatics.tests;

import fmi.informatics.extending.Student;


public class TestMain {

	public static void main(String[] args) {
		Student student = new Student("Kaloqn", 9977, "PU", "STD", 8796);
		Student student2 = new Student("Nikolay", 9988, "PU", "Informatika", 9345);

		
		UnitTestStudent.testStudentUniversity(student);
		UnitTestStudent.testStudentUniversity(student2);

		
		UnitTestStudent.testStudentSpeciality(student);
		UnitTestStudent.testStudentSpeciality(student2);
		
	}

}
