
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: jan 06, 2020
 */

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.util.Scanner;

public class Driver_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Driver_1521551 obj = new Driver_1521551();
    Person_1521551[] p = new Person_1521551[3];

    File myFile = new File("fileOne.txt");
    String path = myFile.getAbsolutePath();

    Address_1521551 a1 = new Address_1521551("61", "2", "Bhashundhara R/A");

    // This object has Invalid phone number 13 digit.
    Person_1521551 p1 = new Person_1521551(5.7, 65.00, "O+", "Asiful", "Alam", "847883839", a1, "+880182317246",
        "MALE");

    Address_1521551 a2 = new Address_1521551("312", "10", "Mumbai");
    // this Objects has invalid data male.
    Person_1521551 p2 = new Person_1521551(5.7, 65.00, "O+", "Sharukh", "Khan", "847883839", a1, "+8801823172464",
        "Male");

    // System.out.println(p2.toString());

    Address_1521551 a3 = new Address_1521551("312", "10", "Mumbai");
    Person_1521551 p3 = new Person_1521551(5.7, 65.00, "O+", "Deepika", "Padukone", "847883839", a1, "+8801823172468",
        "FEMALE");

    // Create total 6 objects, i already create 3, so you have create more 3 objects
    // and resize the array 3 to 6.

    p[0] = p1;
    p[1] = p2;
    p[2] = p3;

    for (int i = 0; i < 3; i++) {
      obj.writeFile(path, p[i]);
    }

    for (int i = 0; i < 3; i++)

    {
      obj.readFile(path);
    }
  }

  void writeFile(String path, Person_1521551 p1) {
    try {

      FileOutputStream fos = new FileOutputStream(path, true);
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(p1.toString() + '\n');

      // oos.flush();
      oos.close();

    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

  void readFile(String path) {
    try {
      // FileInputStream fis = new FileInputStream(path);
      // ObjectInputStream input = new ObjectInputStream();
      File myreader = new File(path);
      Scanner s1 = new Scanner(myreader);
      while (s1.hasNextLine()) {
        String data = s1.nextLine();
        System.out.println(data);
      }
      s1.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }

}
