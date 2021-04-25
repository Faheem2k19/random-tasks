/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 25, 2020
 */

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

public class CSE215_10_Mid_1521551_Q2 {

  
  
  private String nationality;
  private long id;
  private String name;
  private String date;
  private String motherName;
  private String fatherName;

  public CSE215_10_Mid_1521551_Q2(String nationality, long id, String name, String date, String motherName,
      String fatherName) {
    super();
    this.nationality = nationality;
    this.id = id;
    this.name = name;
    this.date = date;
    this.motherName = motherName;
    this.fatherName = fatherName;

  }

  public CSE215_10_Mid_1521551_Q2() {
    super();

    Random rand = new Random();
    this.id = rand.nextLong();
    
    

  }

  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    this.motherName = motherName;
  }

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    this.fatherName = fatherName;
  }

  @Override
  public String toString() {
    return "CSE215_10_Mid_1521551_Q2 [nationality=" + nationality + ", id=" + id + ", name=" + name + ", date=" + date
        + ", motherName=" + motherName + ", fatherName=" + fatherName + "]";
  }
  
}
