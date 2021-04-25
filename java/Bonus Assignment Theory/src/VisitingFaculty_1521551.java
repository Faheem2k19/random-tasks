
public class VisitingFaculty_1521551 extends Faculty_1521551 {

  double BASIC_SALARY = 3000.00;

  public VisitingFaculty_1521551(String name, int age, String nationalId, String address, int f_MAX_COURSE, Course_1521551[] courses,
      int numberOfCourses, String initial) {
    super(name, age, nationalId, address, f_MAX_COURSE, courses, numberOfCourses, initial);
    // TODO Auto-generated constructor stub
  }

  public VisitingFaculty_1521551(String name, int age, String nationalId, String address) {
    super(name, age, nationalId, address);
    // TODO Auto-generated constructor stub
  }

  public double getBASIC_SALARY() {

    double salary = this.getNumberOfCourses() * (this.BASIC_SALARY * (5 / 100)) + this.BASIC_SALARY;
    return salary;
  }

  public void setBASIC_SALARY(double bASIC_SALARY) {
    BASIC_SALARY = bASIC_SALARY;
  }

  @Override
  public String toString() {
    return "VisitingFaculty [BASIC_SALARY=" + BASIC_SALARY + "]";
  }

}
