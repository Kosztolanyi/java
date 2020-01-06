package java_basics;

public class MyUtils {
	public static void printSomething (String arg) {
		System.out.println("You passed the argument " + arg);
	}
	
	public static void sumTwoNumbers(int first, int second) {
		System.out.println(first + second);
	}
	public static int add10 (int number) {
		int result = number + 10;
		return result;
	}
	public int add10NoStatic (int number) {
		int result = number + 10;
		return result;
	}
}
