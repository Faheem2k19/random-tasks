
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 18, 2020
 */

import java.util.Scanner;

public class Quiz1Task1_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    int number1;

    System.out.println("Enter the number: ");

    number1 = input.nextInt();

    int reverseNumber = reverse(number1);

    System.out.println("The Reverse number of " + number1 + " is " + reverseNumber);

    boolean check = isPalindromicInteger(number1, reverseNumber);

    if (check) {

      System.out.println("Palindrome");

    } else
      System.out.println("Not Palindrome");

  }

  public static int reverse(int number) {
    int reveresed = 0;

    while (number != 0) {
      int digit = number % 10;
      reveresed = reveresed * 10 + digit;
      number /= 10;
    }

    return reveresed;
  }

  public static boolean isPalindromicInteger(int number1, int number2) {

    if (number1 == number2)
      return true;
    else
      return false;
  }

}
