public class PracticeProblem {

	public static int sum2D(int[][] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j) {
				sum += arr[i][j];
			}
		}
		return sum;
	}
	public static int sumRow(int[][] array, int rowNum) {
		int sum = 0;
		for(int column = 0; column < array[rowNum].length; column++) {
			sum+=array[rowNum][column];
		}
		return sum;
	}
	public static int sumColumn(int[][] arr, int c) {
		int sum = 0;
		for(int row = 0; row < arr.length; row++) {
					sum+=arr[row][c];
			
		}
		return sum;
	}
	
}