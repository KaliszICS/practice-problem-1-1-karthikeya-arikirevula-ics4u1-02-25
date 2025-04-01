public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] int2DArray) {
		int total = 0;

		for (int i = 0; i < int2DArray.length; i++) {
			for (int j = 0; j < int2DArray[i].length; j++) {
				total += int2DArray[i][j];
			}
		}
		return total;
	}

	public static int sumRow(int[][] int2DArray, int row) {
		int total = 0;

		for (int i = 0; i < int2DArray[row].length; i++) {
			total += int2DArray[row][i];
		}
		return total;
	}

	public static int sumColumn(int[][] int2DArray, int columns) {
		int total = 0;

		for (int i = 0; i < int2DArray.length; i++) {
			total += int2DArray[i][columns];
		}
		return total;
	}
}