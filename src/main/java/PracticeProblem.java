public class PracticeProblem {

	public static int sum2D(int[][] int2DArray) {
		int sum = 0;
		for (int i = 0; i < int2DArray.length; i++) {
			for (int j = 0; j < int2DArray[i].length; j++) {
				sum += int2DArray[i][j];
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