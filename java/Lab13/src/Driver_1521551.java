import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Driver_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Date date1 = new GregorianCalendar(2014, Calendar.APRIL, 11).getTime();
    Date date2 = new GregorianCalendar(2015, Calendar.MARCH, 20).getTime();
    Date date3 = new GregorianCalendar(2016, Calendar.JANUARY, 10).getTime();
    Date date4 = new GregorianCalendar(2017, Calendar.MARCH, 05).getTime();

    String[] arr1 = { "cse215", "cse225" };
    String[] arr2 = { "cse115", "cse225" };
    String[] arr3 = { "cse231", "cse332" };
    String[] arr4 = { "cse327", "cse499B" };

    Faculty_1521551 f1 = new Faculty_1521551("Atiqul", "Rahman", "12345", arr1, "Guest Faculty", date1);
    Faculty_1521551 f2 = new Faculty_1521551("Javed", "Bari", "19384", arr2, "Professor", date2);
    Faculty_1521551 f3 = new Faculty_1521551("Sifat", "momen", "284793", arr3, "Part Time Faculty", date3);
    Faculty_1521551 f4 = new Faculty_1521551("Arefin", "Shimon", "8584593", arr4, "Permanent Faculty", date4);

    Course_1521551 c1 = new Course_1521551("cse215", "Java", "SAS3");
    Course_1521551 c2 = new Course_1521551("Cse115", "Introduction to C", "SAM");
    Course_1521551 c3 = new Course_1521551("cse332", "Introduction to Operating System", "SFM");

    System.out.println(f1.toString());
    System.out.println(f2.toString());
    System.out.println(f3.toString());
    System.out.println(f4.toString());

    System.out.println(c1.toString());
    System.out.println(c2.toString());
    System.out.println(c3.toString());

  }
}
