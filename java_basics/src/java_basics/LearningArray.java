package java_basics;

public class LearningArray {

	public static void main(String[] args) {
		int[] values = new int[100];
		values[2] = 1000;
		values[0] = 1234;
		values[99] = 4321;
		
		System.out.println(values[99]);
		
		String[] words = new String[] {"my", "name", "is"};
		
		System.out.println(words[2]);
		
		words = new String[10];
		System.out.println(words[2]);

	}

}
