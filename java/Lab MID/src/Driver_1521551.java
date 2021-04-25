/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 21, 2020
 */

import java.util.Date;

public class Driver_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Date date = new Date();
    Decagon_1521551 d1 = new Decagon_1521551(2);
    RGB_1521551 r3 = new RGB_1521551();
    d1.setColor(r3);
    d1.setCreatedOn(date);
    Decagon_1521551 d2;
    RGB_1521551 r1 = new RGB_1521551(255, 240, 245);
    d2 = new Decagon_1521551(1, r1, date);

    RGB_1521551 r2 = new RGB_1521551(223, 255, 255);

    Decagon_1521551 d3 = new Decagon_1521551(5, r2, date);

    System.out.println(d2.toString());
    System.out.println(d3.toString());
    System.out.println(d1.toString());

    double a = d1.getArea();
    double b = d2.getArea();
    double c = d3.getArea();

    if (a > b && a > c)
      System.out.println(d1.toString());
    else if (b > a && b > c)
      System.out.println(d2.toString());
    else
      System.out.println(d3.toString());

  }

}

