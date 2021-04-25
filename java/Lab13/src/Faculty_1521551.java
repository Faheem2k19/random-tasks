/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 09, 2020
 */

import java.util.Arrays;
import java.util.Date;

public class Faculty_1521551 {

  String firstName;
  String lastName;
  String id;
  String[] courses;
  String designation;
  Date joininingDate;

  public Faculty_1521551(String firstName, String lastName, String id, String designation, Date joininingDate) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.designation = designation;
    this.joininingDate = joininingDate;
  }

  public Faculty_1521551(String firstName, String lastName, String id, String[] courses, String designation,
      Date joininingDate) {
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.courses = courses;
    this.designation = designation;
    this.joininingDate = joininingDate;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String[] getCourses() {
    return courses;
  }

  public void setCourses(String[] courses) {
    this.courses = courses;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public Date getJoininingDate() {
    return joininingDate;
  }

  public void setJoininingDate(Date joininingDate) {
    this.joininingDate = joininingDate;
  }

  public String getFullName() {
    String fullname = this.firstName + " " + this.lastName;

    return fullname;
  }

  @Override
  public String toString() {
    return "Faculty [firstName=" + firstName + ", lastName=" + lastName + ", id=" + id + ", courses="
        + Arrays.toString(courses) + ", designation=" + designation + ", joininingDate=" + joininingDate + "]";
  }

}
