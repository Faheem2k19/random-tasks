public class Course_1521551 {

  String courseCode;
  String courseTitle;
  String facultyName;

  public Course_1521551(String courseCode, String courseTitle, String facultyName) {
    super();
    this.courseCode = courseCode;
    this.courseTitle = courseTitle;
    this.facultyName = facultyName;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public String getCourseTitle() {
    return courseTitle;
  }

  public void setCourseTitle(String courseTitle) {
    this.courseTitle = courseTitle;
  }

  public String getFacultyName() {
    return facultyName;
  }

  public void setFacultyName(String facultyName) {
    this.facultyName = facultyName;
  }

  public String getCourseCodeAndCourseName() {
    String codeAndTitle = this.courseCode + " " + this.courseTitle;

    return codeAndTitle;
  }

  @Override
  public String toString() {
    return "Course [courseCode=" + courseCode + ", courseTitle=" + courseTitle + ", facultyName=" + facultyName + "]";
  }

}