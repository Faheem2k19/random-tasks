
import java.util.Scanner;
import java.util.Date;

public class CSE215_10_Mid_1521551_Q2_Driver {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    String name;
    String motherName;
    String fatherName;
    String nationality;
    String date;
    long id;
    CSE215_10_Mid_1521551_Q2[] p = new CSE215_10_Mid_1521551_Q2[20];
    CSE215_10_Mid_1521551_Q2_Driver obj = new CSE215_10_Mid_1521551_Q2_Driver();

    System.out.println("Enter 20 objects: ");

    for (int i = 0; i < 20; i++) {

      

      p[i] = new CSE215_10_Mid_1521551_Q2();

    }

    for (int i = 0; i < 20; i++) {
      System.out.println(p[i].toString());
    }

    // Swap the object array with index 7 to Non parameterized constructor.

    CSE215_10_Mid_1521551_Q2 p1 = new CSE215_10_Mid_1521551_Q2();

    p1.setDate("12/10/1990");
    p1.setFatherName("ABUL KASEM");
    p1.setMotherName("JAHANARA BEGUM");
    p1.setNationality("BANGLADESHI");
    p1.setName("ZINATH ALI");
    p1.setId(123456);

    p[1] = p1;

    System.out.println(p[1].toString());

  }
  
  String randomString(int length) {
    
  }

  boolean checkName(String name) {
    boolean flag = false;

    if (name.length() <= 30) {
      for (int i = 0; i < name.length(); i++) {
        char ch = name.charAt(i);

        if (Character.isUpperCase(ch) || ch == ' ') {
          flag = true;
        } else {
          flag = false;
          return flag;
        }

      }
    } else {
      System.out.println("Name Should be Upper Case Letter");
    }

    return flag;

  }

}
