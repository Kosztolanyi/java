package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		
		boolean hungry = true;
		
		if (hungry) {
			System.out.println("I am starving");
		} else {
			System.out.println("I am ok");
		}
		
		int hungerRating = 5;
		
		if (!(hungerRating > 5)) {
			System.out.println("I am starving");
		} else {
			System.out.println("I am ok");
		}
		
		int month = 3;
		String monthString;
		
		switch (month) {
		
		case 1: monthString = "January";
			break;
		case 2: monthString = "February";
			break;
		case 3: monthString = "March";
			break;
		default: monthString = "Unknown";
			break;
		}
		
		System.out.println(monthString);
	}

}
