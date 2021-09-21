package test.challange.Week3;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		int matrix[][] = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		List<Integer> spiral = spiralOrder(matrix);
		for (Integer temp : spiral) {
			System.out.println(temp);
		}
	}

	public static List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<>();
		int left = 0;
		int right = matrix[0].length - 1;
		int top = 0;
		int bottom = matrix.length - 1;
		int listLen = matrix.length * matrix[0].length;
		while (result.size() < listLen) {

			for (int i = left; i <= right && result.size() < listLen; i++) {
				result.add(matrix[top][i]);
			}
			top++;
			for (int i = top; i <= bottom && result.size() < listLen; i++) {
				result.add(matrix[i][right]);
			}
			right--;

			for (int i = right; i >= left && result.size() < listLen; i--) {
				result.add(matrix[bottom][i]);
			}
			bottom--;

			for (int i = bottom; i >= top && result.size() < listLen; i--) {
				result.add(matrix[i][left]);
			}
			left++;
		}
		return result;
	}

}
