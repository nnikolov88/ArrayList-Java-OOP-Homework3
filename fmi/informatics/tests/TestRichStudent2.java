package fmi.informatics.tests;

import fmi.informatics.composition.RichStudent2;


public class TestRichStudent2 {
	
	public static void getTypicalDrinkTest(RichStudent2 student) {
			String getTypicalDrinkExpected = "Whiskey";
			String getTypicalDrinkResult = student.getTypicalDrink();
			
			if (assertString(getTypicalDrinkExpected, getTypicalDrinkResult)) {
				System.out.println("Method getTypicalDrink() from class RichStudent2 returns what is expected");
			} else {
				System.err.println(
						"Method getTypicalDrink() from class RichStudent2 returns: " +
								getTypicalDrinkResult + ", but the expected result is: " +
								getTypicalDrinkExpected
				);
			}
		}
		
		public static boolean assertString(String result, String expectedResult) {
			return result.equals(expectedResult);
		}

		
	}
