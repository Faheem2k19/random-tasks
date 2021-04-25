
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 25, 2020
 */

import java.util.Scanner;

public class Lab8Task8_1521551 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("enter number of employees: ");

    int employee = input.nextInt();
    int[][] matrix = new int[employee][7];

    System.out.println("enter weekly hours for employees: ");
    for (int row = 0; row < matrix.length; row++) {
      for (int column = 0; column < 7; column++)
        matrix[row][column] = input.nextInt();
    }

    for (int row = 0; row < matrix.length; row++) {
      int totalRow = 0;
      int[] total = new int[employee];
      for (int column = 0; column < 7; column++) {
        totalRow += matrix[row][column];
        total[row] = totalRow;
      }

      System.out.println("Working Hours for each employee: ");
      for (int i = 0; i < matrix.length; i++) {
        System.out.println("Employee " + i + " weekly Hours: " + total[i]);
      }
    }
    input.close();
  }
}
