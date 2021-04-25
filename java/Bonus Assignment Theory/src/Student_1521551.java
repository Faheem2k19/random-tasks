
public class Student_1521551 extends Person_1521551 {

  private int F_MAX_COURSE = 5;
  private double cgpa;
  private String id;
  private Course_1521551[] course_1521551s;
  private int numberofCourse = 0;

  public Student_1521551(String name, int age, String nationalId, String address) {
    super(name, age, nationalId, address);
    // TODO Auto-generated constructor stub
  }

  public Student_1521551(String name, int age, String nationalId, String address, int f_MAX_COURSE, double cgpa, String id,
      Course_1521551[] courses, int numberofCourse) {
    super(name, age, nationalId, address);
    F_MAX_COURSE = f_MAX_COURSE = 5;
    this.cgpa = cgpa;
    this.id = id;
    this.course_1521551s = courses;
    this.numberofCourse = numberofCourse;
  }

  public int getF_MAX_COURSE() {
    return F_MAX_COURSE;
  }

  public void setF_MAX_COURSE(int f_MAX_COURSE) {
    F_MAX_COURSE = f_MAX_COURSE;
  }

  public double getCgpa() {
    return cgpa;
  }

  public void setCgpa(double cgpa) {
    this.cgpa = cgpa;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Course_1521551[] getCourses() {
    return course_1521551s;
  }

  public void setCourses(Course_1521551[] courses) {
    this.course_1521551s = courses;
  }

  public int getNumberofCourse() {
    return numberofCourse;
  }

  public void setNumberofCourse(int numberofCourse) {
    this.numberofCourse = numberofCourse;
  }

  public void addCourse(Course_1521551[] course) {
    if (course.length < 5) {
      this.course_1521551s = course;
    } else {
      System.out.println(" You have taken 5 courses already, you can not take more.");
    }
  }

  public void printCourses() {
    for (int i = 0; i < course_1521551s.length; i++) {
      System.out.println(course_1521551s[i].toString());
    }

  }

  @Override
  public String toString() {
    return "Student [F_MAX_COURSE=" + F_MAX_COURSE + ", cgpa=" + cgpa + ", id=" + id + ", numberofCourse="
        + numberofCourse + "]";
  }

}
