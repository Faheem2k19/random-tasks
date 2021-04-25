
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 16, 2020
 */

import java.util.Scanner;

public class Lab6Task6_1521551 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int size = 0;

    int numberTest;

    System.out.println("Enter the number of values: ");

    size = input.nextInt();

    int[] myArray = new int[size];

    System.out.println("Enter the values: ");

    for (int i = 0; i < myArray.length; i++) {
      myArray[i] = input.nextInt();
    }

    numberTest = indexOfConsecutiveFour(myArray);

    if (numberTest != -1)

    {
      System.out.println("The list has consecutive fours, staring at index " + numberTest);
    } else {

      System.out.println("The list has no consecutive fours.");
    }

  }

  public static int indexOfConsecutiveFour(int[] values) {

    int[] myvalues = values;

    int count1 = 2;
    boolean check = false;
    boolean check2 = true;
    int number;

    for (int i = 0; i < myvalues.length; i++) {
      number = myvalues[i];
      int number1 = i + 1;

      if (number1 == myvalues.length)
        number1 = i - 1;

      if (i > 0 && i < myvalues.length) {
        if (number == myvalues[i - 1] && number == myvalues[number1]) {
          count1++;
        }
        if (count1 == 4) {
          check = true;
          count1 = i - 2;
          return count1;

        } else if (number != myvalues[i - 1] || number != myvalues[number1]) {
          count1 = 2;
        }

      }

    }
    if (check)
      return count1;

    else
      return -1;

  }

}
