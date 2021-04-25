/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 16, 2020
 */

import java.util.Scanner;

public class Lab5Task5_1521551 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String pass;
    boolean flag = false;

    System.out.println("Enter your password: ");

    pass = input.next();

    if (pass.length() >= 10) {

      flag = checkPass(pass);

      if (flag) {

        System.out.println("password is valid.");
      } else
        System.out.println("invalid password");
    } else
      System.out.println("password length should be at least 10 char long.");

  }

  public static boolean checkPass(String password) {

    String str = password.toLowerCase();
    int count = 0;
    boolean flag = false;

    for (int i = 0; i < password.length(); i++) {

      char ch = str.charAt(i);

      switch (ch) {

      case 'a':
      case 'b':
      case 'c':
      case 'd':
      case 'e':
      case 'f':
      case 'g':
      case 'h':
      case 'i':
      case 'j':
      case 'k':
      case 'l':
      case 'm':
      case 'n':
      case 'o':
      case 'p':
      case 'q':
      case 'r':
      case 's':
      case 't':
      case 'u':
      case 'v':
      case 'w':
      case 'x':
      case 'y':
      case 'z':
        flag = true;
        break;
        
      case '0':
      case '1':
      case '2':
      case '3':
      case '4':
      case '5':
      case '6':
      case '7':
      case '8':
      case '9':
        count++;

        flag = count >= 3 ? true : false;
        break;

      default:

        flag = false;

        return flag;

      }

    }

    return flag;

  }

}

