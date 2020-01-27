package fmi.informatics.extending;

import java.util.ArrayList;
import java.util.Calendar;

public class TestPerson {
	
	  public static void main(String[] args) {


		  Student s = new Student("Pesho", 838383, "PU", "Informatics", 12365);
		  s.run();
		  s.goBar();
	
		  Calendar cal = Calendar.getInstance();
		  cal.set(2019, 1, 1, 8, 0, 0);
		  s.getUpEarly(cal);
		  System.out.println("Student name: " + s.getName());
		  System.out.println("Student EGN: " + s.getEgn());
		  System.out.println("Overrided toString method: " + s.toString());
		  System.out.println();
		  
		  Professor prof = new Professor();
		  prof.setTitle("Assistant");
		  prof.walk();
		  prof.goBar();
		  System.out.println(prof.toString());
		  System.out.println();
		  
		  printPerson();
	  }

	public static void printPerson() {	
		ArrayList<Person> persons = new ArrayList<>();
		
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				persons.add(new Student());
			} else {
				persons.add(new Professor());
			}
		}


		System.out.println("Show all elements from the list:");
		for (Person p : persons) {
			System.out.println(p.toString());
		}
	}
}