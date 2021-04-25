
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 2, 2020
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Lab2Task2_1521551 {
  public static void main(String args[]) throws Exception {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("1 (even or odd number)");
    System.out.println("2 (prime number or not)");
    System.out.println();
    System.out.print("Select 1 or 2: ");
    int select = Integer.parseInt(in.readLine());
    switch (select) {
    case 1:
      int num;
      System.out.print("Enter a number: ");

      Scanner input = new Scanner(System.in);
      num = input.nextInt();

      if (num % 2 == 0)
        System.out.println("number is even");
      else
        System.out.println("number is odd");
      break;
    case 2:
      int temp;
      boolean isPrime = true;
      Scanner scan = new Scanner(System.in);
      System.out.print("Enter a number: ");

      int numb = scan.nextInt();
      for (int i = 2; i <= numb / 2; i++) {
        temp = numb % i;
        if (temp == 0) {
          isPrime = false;
          break;
        }
      }

      if (isPrime)
        System.out.println(numb + " is a prime");
      else
        System.out.println(numb + " is not prime");
    }
  }
} 