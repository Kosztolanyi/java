package arrays;

public class DiagonalMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		for (int i = 0; i < 4; i++) {
			matrix[i][i] = 1;

		}
		PrintMatrix.printMatrix(matrix);
}

}
