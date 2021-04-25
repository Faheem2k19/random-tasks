import java.util.Scanner;

/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 04, 2020
 */

public class Lab3Task3_1521551 {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Enter string : ");

    String str = input.nextLine();
    int len = str.length();

    System.out.println("Length is : " + len);

    int lenCount = 0;
    int upper = 0;
    int lower = 0;
    int vowels = 0;
    int cons = 0;
    int punc = 0;
    int digit = 0;

    String strLower = str.toLowerCase();

    while (lenCount < str.length()) {

      char ch = str.charAt(lenCount);
      upper = Character.isUpperCase(ch) ? ++upper : upper;

      lower = Character.isLowerCase(ch) ? ++lower : lower;

      char currentChar = strLower.charAt(lenCount);

      switch (currentChar) {

      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
        vowels++;
        break;

      case 'b':
      case 'c':
      case 'd':
      case 'f':
      case 'g':
      case 'h':
      case 'j':
      case 'k':
      case 'l':
      case 'm':
      case 'n':
      case 'p':
      case 'q':
      case 'r':
      case 's':
      case 't':
      case 'v':
      case 'w':
      case 'x':
      case 'y':
      case 'z':
        cons++;
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
        digit++;
        break;

      case '.':
      case ',':
      case '?':
      case '!':
        punc++;
        break;

      default:
        break;

      }
      lenCount++;
    }

    System.out.println("Number of Lower case letters : " + lower);
    System.out.println("Number of upper case letters : " + upper);
    System.out.println("Number of vowels : " + vowels);
    System.out.println("Number Of consunent :" + cons);
    System.out.println("Number of punctuation : " + punc);
    System.out.println("Number of digit : " + digit);

  }

}
