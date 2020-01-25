package fmi.informatics.tests;

import fmi.informatics.extending.Student;

public class UnitTestStudent {

	public static void testStudentUniversity(Student student) {
		String expectedUniversity = "PU";
		String resultUniversity = student.getUniversity();
		
		if (assertString(resultUniversity, expectedUniversity)) {
			System.out.println("Studenta uchi v Plovdivskiq Universitet");
		} else {
			System.out.println(
					"Studenta ne uchi v " +	expectedUniversity 
					+ ", no uchi  " + resultUniversity);
		}
	}
	
	public static void testStudentSpeciality(Student student) {
		String expectedSpeciality = "STD";
		String resultSpeciality = student.getSpeciality();
		
		if (assertString(resultSpeciality, expectedSpeciality)) {
			System.out.println("\nStudenta uchi STD");
		} else {
			System.out.println(
					"Studenta ne uchi v " + expectedSpeciality 
					+ ", no uchi " + resultSpeciality);
		}
	}
		
	public static boolean assertString(String result, String expectedResult) {
		return result.equals(expectedResult);
	}
}
