
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 2, 2020
 */

import java.util.Arrays;

public class BonusAssignment1_1521551 {

  public static void main(String[] args) {
    double[][] matrix = { { 4.5, 4.2, 0.33, 3.2 }, { 2.3, 5.6, 3.5, 2.3 }, { 2.3, 11.4, 5.6, 23.3 },
        { 6.7, 4.5, 3.4, 2.23 } };

    double[] result = twoDiagonalSum(matrix);

    System.out.println(Arrays.toString(result));
  }

  public static double[] twoDiagonalSum(double[][] matrix) {
    double primaryDiagonalSum = 0;
    double secondaryDiagonalSum = 0;

    double[] result = new double[2];

    // primary diagonal sum
    for (int rowIndex = 0; rowIndex < 4; rowIndex++) {
      for (int columnIndex = rowIndex; columnIndex <= rowIndex; columnIndex++) {
        primaryDiagonalSum += matrix[rowIndex][columnIndex];
      }
    }
    result[0] = primaryDiagonalSum;

    // secondary diagonal sum
    for (int rowIndex = 3; rowIndex >= 0; rowIndex--) {
      for (int columnIndex = rowIndex; columnIndex >= rowIndex; columnIndex--) {
        secondaryDiagonalSum += matrix[rowIndex][3 - columnIndex];
      }
    }
    result[1] = secondaryDiagonalSum;

    return result;
  }
}
