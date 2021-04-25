
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 23, 2020
 */

import java.util.Scanner;

public class Lab7Task7_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    int size;

    System.out.println("Enter size of array: ");

    size = input.nextInt();

    double[] arr1 = new double[size];
    double[] arr2 = new double[size];
    double[] arr3 = new double[size];
    double[] arr4 = new double[size];

    for (int i = 0; i < size; i++) {
      System.out.println("Enter the elements for array 1 :");

      arr1[i] = input.nextDouble();

      System.out.println("Enter the elements for array 2 :");

      arr2[i] = input.nextDouble();

      System.out.println("Enter the elements for array 3 :");

      arr3[i] = input.nextDouble();

    }

    arr4 = elementwiseSum(arr1, arr2, arr3);
    System.out.println("Result: ");
    for (int i = 0; i < arr4.length; i++) {

      System.out.println(" " + arr4[i]);
    }

  }

  public static double[] elementwiseSum(double[] arr1, double[] arr2, double[] arr3) {
    double[] result = new double[arr1.length];
    for (int i = 0; i < arr1.length; i++) {

      result[i] = arr1[i] + arr2[i] + arr3[i];
    }

    return result;
  }
}
