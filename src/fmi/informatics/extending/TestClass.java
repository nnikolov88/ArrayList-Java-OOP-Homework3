package fmi.informatics.extending;

import java.util.ArrayList;

import fmi.informatics.composition.RichStudent2;

public class TestClass {

	
	public static void addPeople(ArrayList<Person> people) {
		people.add(new Student("Gosho", 556, "PU", "9521", 3214));
		people.add(new RichStudent2("Nikolay", 9988, "PU", "Informatika", 9345));
		people.add(new RichStudent2("Kaloqn", 9977, "PU", "STD", 8796));
		people.add(new Professor("Professor", "Stanimir", true, 40, 180, 9654));
		people.add(new RichStudent2("Gosho", 456, "SU", "Informatika", 2789));
		people.add(new Student("Yordan", 567, "TU", "3216", 3896));
		people.add(new Professor("Professor", "Angel", true, 40, 175, 35));
		people.add(new Professor("Professor", "Petur", true, 40, 185, 55));
		people.add(new RichStudent2("Angel", 2233, "PU", "Matematika", 5345));
		people.add(new Professor("Professor", "Petur", true, 40, 155, 50));
		people.add(new Professor("Professor", "Petur", true, 40, 145, 60));
	}

	public static void showStats(ArrayList<Person> people) {

		
		int stuCounter = 0, profCounter = 0, richCounter = 0;
		for (int i = 0; i < people.size(); i++) {
			if (people.get(i) instanceof RichStudent2) {
				System.out.println("Az sum bogat student " + people.get(i).getClass().getSimpleName());
				richCounter++;

			} else if (people.get(i) instanceof Professor) {
				System.out.println("Az sum Profesor " + people.get(i).getClass().getSimpleName());
				profCounter++;
			} else {
				System.out.println("Az sum Student  " + people.get(i).getClass().getSimpleName());
				stuCounter++;
			}
		}

		
		System.out.println("\nBroqt na studentite e: " + stuCounter + "\nBroqt na profesorite e: "
				+ profCounter + "\nBroqt na bogatite studenti e: " + richCounter);
		System.out.println("\nObshtiq broi na vsichki hora e: " + (stuCounter + profCounter + richCounter) + "\n");

		
		for (int i = 0; i < people.size(); i++) {
			if (!(people.get(i) instanceof Professor)) {
				people.get(i).study();
			}
		}
	}

	
	public static void testAdaptableClass() {

		     Student student = new Student("Gosho", 556, "PU", "9521", 3214) {

			@Override
			public void study() {
				System.out.println("\nStudenta uchi vmomenta.");
			}

			@Override
			public void think() {
				System.out.println("\nStudenta si misli kak da napravi domashanta si rabota.");
			}

			@Override
			public void act() {
				System.out.println("\nVmomenta  studenta deistva.");
			}
		};
		student.study();
		student.think();
		student.act();
	}

	
	public static void testClassInstance()
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Class<?> studentForName = Class.forName(Student.class.getName());
		System.out.println("\nThe student's class forName is: " + studentForName);
		Student studentInstance = (Student) studentForName.newInstance();
		studentInstance.takeExam();

	}

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		ArrayList<Person> people = new ArrayList<>();

		addPeople(people);		
		showStats(people);
		testAdaptableClass();
		testClassInstance();
	}
}