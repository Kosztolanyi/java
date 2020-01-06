package arrays;

import java.util.Arrays;

public class PrintArrays {
	
	public static void printMatrix (int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
		    for (int j = 0; j < matrix[i].length; j++) {
		        System.out.print(matrix[i][j] + " ");
		    }
		    System.out.println();
		}
	}
	
	public static void printArray (int[] array) {
		System.out.println(Arrays.toString(array));
	}

}
