
public class Driver_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Course_1521551 a = new Course_1521551("CSE215", "Java", new CourseTime_1521551("MW", "9:40", "11:10"));
    Course_1521551 b = new Course_1521551("CSE225", "Data Stracture", new CourseTime_1521551("ST", "11:10", "12:40"));
    Course_1521551 c = new Course_1521551("MAT116", "PreCalculas", new CourseTime_1521551("R", "1:00", "2:40"));

    System.out.println(a);
    System.out.println(b);
    System.out.println(c);

    System.out.println(a.isRelatedCourse(a));
    System.out.println(a.isRelatedCourse(b));
    System.out.println(a.isRelatedCourse(c));

  }

}
