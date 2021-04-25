
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 27, 2020
 */

import java.util.Scanner;

public class Problem2 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    int number;
    String str;

    System.out.println("Enter and Integer and printable string: ");

    number = input.nextInt();
    str = input.next();

    printPyramid(number, str);
  }

  public static void printPyramid(int num, String s1)

  {
    for (int i = 0; i <= num - 1; i++) {
      for (int j = 0; j <= i; j++) {
        System.out.print(s1 + " ");
      }
      System.out.println("");
    }

    for (int i = num - 1; i >= 0; i--) {
      for (int j = 0; j <= i - 1; j++) {
        System.out.print(s1 + " ");
      }
      System.out.println("");
    }

  }
}
