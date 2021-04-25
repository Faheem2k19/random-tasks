
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 30, 2020
 */

import java.util.Scanner;
import java.util.Date;

public class Driver_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    Polygon_1521551[] p1 = new Polygon_1521551[9];

    Driver_1521551 driver = new Driver_1521551();

    double l1; // hold the side length of Polygon_1521551.

    for (int i = 0; i < 9; i++) {
      System.out.println("Enter the length of the sides: ");

      l1 = input.nextDouble();
      System.out.println("Enter Red: ");
      short r1 = input.nextShort();
      System.out.println("Enter Green: ");
      short r2 = input.nextShort();
      System.out.println("Enter Blue:");
      short r3 = input.nextShort();

      RGB_1521551 RGB_15215511 = new RGB_1521551(r1, r2, r3);

      if (i < 3) {
        p1[i] = new Octagon_1521551(RGB_15215511, new Date(), l1);
      } else if (i < 6) {
        p1[i] = new Nonagon_1521551(RGB_15215511, new Date(), l1);
      } else {
        p1[i] = new Decagon_1521551(RGB_15215511, new Date(), l1);
      }
    }

    for (int i = 0; i < 9; i++) {
      System.out.println(p1[i].toStringPrint());

    }
    // Compar Octagon_1521551 with Octagon_1521551.
    driver.compareCheck(p1[0], p1[1]);
    // Nonagon_1521551 with Nonagon_1521551.
    driver.compareCheck(p1[4], p1[5]);
    // Nonagon_1521551 with Decagon_1521551.
    if (p1[5] instanceof Nonagon_1521551 && p1[7] instanceof Nonagon_1521551) {
      driver.compareCheck(p1[5], p1[7]);
    } else {
      System.out.println("The TYPE of Objects p1 and p2 are not same.");
    }
    Cloneable_1521551 n2 = p1[0];

    System.out.println(n2.toString());

    input.close();

  }

  public void compareCheck(Polygon_1521551 p1, Polygon_1521551 p2) {
    if (p1.compareTo(p2) == 1) {
      System.out
          .println("Area of the object 1 is " + p1.computeArea() + " and Area of the object 2 is " + p2.computeArea());
      System.out.println(
          "this Object with Area " + p1.computeArea() + " is Greater than this object with Area " + p2.computeArea());
    }

    else if (p1.compareTo(p2) == 2) {
      System.out
          .println("Area of the object 1 is " + p1.computeArea() + " and Area of the object 2 is " + p2.computeArea());
      System.out.println(
          "this Object with Area " + p1.computeArea() + " is equal to this object with Area " + p2.computeArea());
    }

    else if (p1.compareTo(p2) == 3) {
      System.out
          .println("Area of the object 1 is " + p1.computeArea() + " and Area of the object 2 is " + p2.computeArea());

      System.out
          .println("this Object Area " + p1.computeArea() + " is less than this Object with Area " + p2.computeArea());

    } else {
      System.out.println("The TYPE of Objects p1 and p2 are not same.");
    }
  }

}
