
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 27, 2020
 */

import java.util.Scanner;

public class Problem1 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    String s1, s2;
    int numberInt;
    long numberLong;
    double numberDouble;
    float numberFloat;

    boolean check, checkInt, checkLong, checkDouble, checkFloat;

    System.out.println("Enter a string: ");
    s1 = input.next();
    System.out.println("Length is: " + s1.length());

    System.out.println("Enter an integer: ");

    numberInt = input.nextInt();

    s2 = s1.toLowerCase();
    System.out.println("String s1: " + s1);
    System.out.println("String s2: " + s2);

    check = isPalindrome(s2);
    checkInt = isPalindrome(numberInt);

    if (check) {
      System.out.println(s1 + " is a Palindrome.");
    }

    else
      System.out.println(s1 + " is not a Palindrome.");

    if (checkInt) {
      System.out.println(numberInt + " is a Palindrome");
    } else
      System.out.println(numberInt + " is not a Palindrome");

    System.out.println("Enter a Long Number: ");

    numberLong = input.nextLong();

    checkLong = isPalindrome(numberLong);

    if (checkLong) {
      System.out.println(numberLong + " is a Palindrome");
    } else
      System.out.println(numberLong + " is not a palindrome");

  }

  public static boolean isPalindrome(String s3) {
    int len = s3.length() / 2;
    int count = s3.length() - 1;
    boolean flag = false;
    for (int i = 0; i <= len; i++) {
      if (s3.charAt(i) == s3.charAt(count)) {

        count--;
        flag = true;
      } else if (s3.charAt(i) == '0' && s3.charAt(count) == 'o') {
        count--;
        flag = true;
      } else if (s3.charAt(i) == 'o' && s3.charAt(count) == '0') {
        count--;
        flag = true;
      } else if (s3.charAt(i) == '1' && s3.charAt(count) == 'i') {
        count--;
        flag = true;
      } else if (s3.charAt(i) == 'i' && (s3.charAt(count) == '1' || s3.charAt(count) == 'l')) {
        count--;
        flag = true;
      } else if (s3.charAt(i) == '3' && s3.charAt(count) == 'e') {

        count--;
        flag = true;
      } else if (s3.charAt(i) == 'e' && s3.charAt(count) == '3') {
        count--;
        flag = true;
      }

      else {
        flag = false;
        return flag;
      }
    }

    return flag;

  }

  public static boolean isPalindrome(int number) {
    int numberIn = number;

    int digit;
    int reverse = 0;

    while (numberIn != 0) {
      digit = numberIn % 10;
      reverse = 10 * reverse + digit;
      numberIn /= 10;
    }

    if (reverse == number)
      return true;
    else
      return false;
  }

  public static boolean isPalindrome(long number) {
    long numberIn = number;
    long digit;
    long reverse = 0;

    while (numberIn != 0) {
      digit = numberIn % 10;
      reverse = 10 * reverse + digit;
      numberIn /= 10;
    }

    if (reverse == number)
      return true;
    else
      return false;
  }

  public static boolean isPalindrome(double number) {
    double numberIn = number;
    double digit;
    double reverse = 0;

    while (numberIn != 0) {
      digit = numberIn % 10;
      reverse = 10 * reverse + digit;
      numberIn /= 10;
    }
    if (reverse == number)
      return true;
    else
      return false;
  }

  public static boolean isPalindrome(float number) {
    float numberIn = number;
    float digit;
    float reverse = 0;

    while (numberIn != 0) {
      digit = numberIn % 10;
      reverse = 10 * reverse + digit;
      numberIn /= 10;
    }
    if (reverse == number)
      return true;
    else
      return false;
  }

}

