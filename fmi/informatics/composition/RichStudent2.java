package fmi.informatics.composition;

import java.util.Calendar;

import fmi.informatics.extending.Student;

import fmi.informatics.composition.RichStudent2;

import fmi.informatics.interfaces.Adaptable;



public class RichStudent2 extends Student {
	
	private Student student;
	
	public RichStudent2(){
		
	}
	
	public RichStudent2(String name, int egn,String university,String speciality,int facNumber) {
		super(name, egn, university, speciality, facNumber);
	}
	
		 @Override
		public String getSpeciality() {
			return "STD";
		}

		 @Override 
		public void study() {
			System.out.println("The Rich student2 isn't studying because He has a lot of money!");
		 }

		public String  getTypicalDrink() {
				return "50 years Black Johny ";
			
		}

			public void run() { 
				student.run(); 
			}
			
			public void study2() { 
				student.study(); 
			}
			
			public void takeExam() { 
				student.takeExam(); 
			}
			
			public void getUpEarly(Calendar hour) { 
				student.getUpEarly(hour);
			}

			public void goBar() {
				System.out.println("The " + this.getClass().getSimpleName() + " " + 
						student.getName() + " drinking ");
				System.out.println("50 years Black Johny");
			}
			
			@Override
			public String toString() { 
				return student.toString(); 
			}
			
			public String getUniversity() { 
				return student.getUniversity(); 
			}
			
			public void setUniversity(String university) { 
				student.setUniversity(university);
			}
			
			public String getSpeciality2() { 
				return student.getSpeciality();
			}
			
			public void setSpeciality(String speciality) { 
				student.setSpeciality(speciality);
			}
		}

