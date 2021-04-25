
import java.util.Arrays;

public class Faculty_1521551 extends Person_1521551 {

  private int F_MAX_COURSE = 5;
  private Course_1521551[] course_1521551s;
  private int numberOfCourses = 0;
  private String initial;

  public Faculty_1521551(String name, int age, String nationalId, String address, int f_MAX_COURSE, Course_1521551[] courses,
      int numberOfCourses, String initial) {
    super(name, age, nationalId, address);
    F_MAX_COURSE = f_MAX_COURSE;
    this.course_1521551s = courses;
    this.numberOfCourses = numberOfCourses;
    this.initial = initial;
  }

  public Faculty_1521551(String name, int age, String nationalId, String address) {
    super(name, age, nationalId, address);
    // TODO Auto-generated constructor stub
  }

  public int getF_MAX_COURSE() {
    return F_MAX_COURSE;
  }

  public void setF_MAX_COURSE(int f_MAX_COURSE) {
    F_MAX_COURSE = f_MAX_COURSE;
  }

  public Course_1521551[] getCourses() {
    return course_1521551s;
  }

  public void setCourses(Course_1521551[] courses) {
    this.course_1521551s = courses;
  }

  public int getNumberOfCourses() {
    return numberOfCourses;
  }

  public void setNumberOfCourses(int numberOfCourses) {
    this.numberOfCourses = numberOfCourses;
  }

  public String getInitial() {
    return initial;
  }

  public void setInitial(String initial) {
    this.initial = initial;
  }

  public void printCourses() {
    for (int i = 0; i < course_1521551s.length; i++) {
      System.out.println(course_1521551s[i].toString());
    }
  }

  public void addCourse(Course_1521551[] course) {
    if (course_1521551s.length < this.F_MAX_COURSE) {
      this.course_1521551s = course;
    } else {
      System.out.println(" You have taken 5 courses already, you can not take more.");
    }
  }

  @Override
  public String toString() {
    return "Faculty [F_MAX_COURSE=" + F_MAX_COURSE + ", courses=" + Arrays.toString(course_1521551s) + ", numberOfCourses="
        + numberOfCourses + ", initial=" + initial + "]";
  }

}
