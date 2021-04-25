import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Driver {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    System.out.print("first name : ");
    String fname = in.nextLine().trim();

    while (!Person.isValidName(fname)) {
      System.out.print("invalid data, re-enter : ");
      fname = in.nextLine().trim();
    }
    System.out.print("last name : ");
    String lname = in.nextLine().trim();

    while (!Person.isValidName(lname)) {
      System.out.print("Invalid data, re-enter : ");
      lname = in.nextLine().trim();
    }
    System.out.print("father's name : ");
    String fatherName = in.nextLine().trim();

    while (!Person.isValidName(fatherName)) {
      System.out.print("Invalid data, re-enter : ");
      fatherName = in.nextLine().trim();
    }
    System.out.print("mother's name : ");
    String motherName = in.nextLine().trim();

    while (!Person.isValidName(motherName)) {
      System.out.print("Invalid data, re-enter : ");
      motherName = in.nextLine().trim();
    }
    System.out.print("Date of Birth(DD-MM-YYYY): ");
    String dob = in.nextLine().trim();
    System.out.print("NID:");
    String nid = in.nextLine().trim();

    while (!Person.isValidNID(nid)) {
      System.out.print("Invalid nid, re-enter : ");
      nid = in.nextLine().trim();
    }

    Person p1 = Person.getPerson(fname, lname, fatherName, motherName, nid);
    System.out.printf(p1 + "\n");

    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date date = null;
    try {
      date = dateFormat.parse(dob);
    } catch (ParseException e) {
      date = null;
    }

    Person p2 = Person.getPerson(fname, lname, fatherName, motherName, date, nid);
    System.out.printf(p2 + "\n");

    Person p3 = Person.getPerson(fname, lname, fatherName, motherName, nid, new Pixel[256][256]);
    System.out.printf(p3 + "\n");

    Person p4 = Person.getPerson(fname, lname, fatherName, motherName, date, nid, null);
    System.out.printf(p4 + "\n");

    in.close();
  }

}

