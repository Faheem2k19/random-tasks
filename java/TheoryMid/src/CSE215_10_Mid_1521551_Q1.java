/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 25, 2020
 */

import java.util.Scanner;

public class CSE215_10_Mid_1521551_Q1 {

  int[][][] sort(int[][][] arr) {

    int[] arr1 = new int[25];

    int[][][] arr2 = new int[1][5][5];

    int count = 0;
    for (int i = 0; i < 1; i++) {
      for (int j = 0; j < 5; j++) {
        for (int k = 0; k < 5; k++) {
          arr1[count] = arr[i][j][k];
          count++;
        }

      }
    }
    int n = arr1.length;
    for (int i = 1; i < n; ++i) {
      int key = arr1[i];
      int j = i - 1;

      while (j >= 0 && arr1[j] > key) {
        arr1[j + 1] = arr1[j];
        j = j - 1;
      }
      arr1[j + 1] = key;
    }

    count = 0;

    for (int i = 0; i < 1; i++) {
      for (int j = 0; j < 5; j++) {
        for (int k = 0; k < 5; k++) {
          arr2[i][j][k] = arr1[count];
          count++;
        }

      }
    }

    return arr2;
  }

  public static void main(String[] args) {

    int[][][] arr = new int[1][5][5];
    int[][][] arrSort = new int[1][5][5];
    CSE215_10_Mid_1521551_Q1 obj = new CSE215_10_Mid_1521551_Q1();

    Scanner input = new Scanner(System.in);

    System.out.println("Enter an array of size 25");

    for (int i = 0; i < 1; i++) {
      for (int j = 0; j < 5; j++) {
        for (int k = 0; k < 5; k++) {
          arr[i][j][k] = input.nextInt();
        }
      }
    }

    arrSort = obj.sort(arr);
    System.out.println("Print the array");

    for (int i = 0; i < 1; i++) {
      for (int j = 0; j < 5; j++) {
        for (int k = 0; k < 5; k++) {
          System.out.println(arrSort[i][j][k]);
        }
      }
    }

    input.close();

  }

}
