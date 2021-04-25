/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: October 28, 2020
 */

package com.alam.lab1;

import java.util.Scanner;

public class Lab1Task1_1521551 {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("a: ");
    String name = in.nextLine();
    System.out.println("full name: " + name);

    System.out.println("b: ");
    int id = in.nextInt();
    System.out.println("id: " + id);

    System.out.println("c: ");
    int numSemester = in.nextInt();
    System.out.println("total semester: " + numSemester);

    in.nextLine();

    System.out.println("d ");
    String cName = in.nextLine();
    System.out.println("Course name: " + cName);

    System.out.println("e: ");
    int cCode = in.nextInt();
    System.out.println("Course code: " + cCode);

    in.nextLine();

    System.out.println("f: ");
    String instructorN = in.nextLine();
    System.out.println("Instructor name: " + instructorN);
  }

}
