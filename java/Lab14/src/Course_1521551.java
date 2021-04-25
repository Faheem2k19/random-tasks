/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 14, 2020
 */

public class Course_1521551 {

  private String courseCode;
  private String courseTitle;
  private CourseTime_1521551 timing;

  public Course_1521551(String courseCode, String courseTitle, CourseTime_1521551 timing) {
    this.courseCode = courseCode;
    this.courseTitle = courseTitle;
    this.timing = timing;
  }

  public String getCourseCodeAndCourseName() {
    return courseCode + "" + courseTitle;
  }

  public String getCourseCode() {
    return courseCode;
  }

  public String getCourseName() {
    return courseTitle;
  }

  public CourseTime_1521551 getTiming() {
    return timing;
  }

  public boolean isRelatedCourse(Course_1521551 another) {
    return courseCode.substring(0, 3).contentEquals(another.courseCode.substring(0, 3));
  }

  public String toString() {
    return "Course_1521551 [courseCode=" + courseCode + ", courseTitle=" + courseTitle + ", timing=" + timing + "]";
  }
}

