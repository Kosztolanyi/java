package arrays;

public class DoubleItems {

	public static void main(String[] args) {
		int[] items = { 3, 4, 5, 6};
		for (int i = 0; i < items.length; i++) {
			items[i] = items[i] * 2;
		}
		
		PrintArrays.printArray(items);
	}

}
