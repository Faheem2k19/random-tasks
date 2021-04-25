
/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 20, 2020
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Person {
  private String fname;
  private String lname;
  private String fatherName;
  private String motherName;
  private Date dob;
  private String nid;
  Pixel[][] pixels;

  private Person(String fname, String lname, String fatherName, String motherName, String nid) {
    super();
    this.fname = fname;
    this.lname = lname;
    this.fatherName = fatherName;
    this.motherName = motherName;
    this.nid = nid;
  }

  // Overloaded constructor in case user wants to provide pixels along with
  // mandatory fields
  private Person(String fname, String lname, String fatherName, String motherName, String nid, Pixel[][] pixels) {
    super();
    this.fname = fname;
    this.lname = lname;
    this.fatherName = fatherName;
    this.motherName = motherName;
    this.nid = nid;
    this.pixels = pixels;
  }

  private Person(String fname, String lname, String fatherName, String motherName, Date dob, String nid) {
    super();
    this.fname = fname;
    this.lname = lname;
    this.fatherName = fatherName;
    this.motherName = motherName;
    this.dob = dob;
    this.nid = nid;
  }

  private Person(String fname, String lname, String fatherName, String motherName, Date dob, String nid,
      Pixel[][] pixels) {
    super();
    this.fname = fname;
    this.lname = lname;
    this.fatherName = fatherName;
    this.motherName = motherName;
    this.dob = dob;
    this.nid = nid;
    this.pixels = pixels;
  }

  public String getfname() {
    return fname;
  }

  public void setfname(String fname) {
    if (isValidName(fname))
      this.fname = fname;
  }

  public String getlname() {
    return lname;
  }

  public void setlname(String lname) {
    if (isValidName(lname))
      this.lname = lname;
  }

  public String getFatherName() {
    return fatherName;
  }

  public void setFatherName(String fatherName) {
    if (isValidName(fatherName))
      this.fatherName = fatherName;
  }

  public String getMotherName() {
    return motherName;
  }

  public void setMotherName(String motherName) {
    if (isValidName(motherName))
      this.motherName = motherName;
  }

  public Date getDob() {
    return dob;
  }

  public void setDob(Date dob) {
    if (dob == null) {
      DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
      try {
        Date date = dateFormat.parse("01-01-1970");
        this.dob = date;
      } catch (ParseException e) {
        e.printStackTrace();
      }
      return;
    }
    this.dob = dob;
  }

  public String getNid() {
    return nid;
  }

  public void setNid(String nid) {
    if (isValidNID(nid))
      this.nid = nid;
  }

  public Pixel[][] getPixels() {
    return pixels;
  }

  public void setPixels(Pixel[][] pixels) {
    if (pixels == null || pixels.length != 256 || pixels[0].length != 256)
      this.pixels = new Pixel[256][256];
    else {
      this.pixels = pixels;
    }
  }

  public static Person getPerson(String fname, String lname, String fatherName, String motherName, String nid) {
    if (!isValidName(fname) || !isValidName(lname) || !isValidName(fatherName) || !isValidName(motherName))
      return null;
    if (!isValidNID(nid))
      return null;
    Person p = new Person(fname, lname, fatherName, motherName, nid);
    p.setDob(null);
    p.setPixels(null);
    initPixel(p.getPixels());
    return p;
  }

  public static Person getPerson(String fname, String lname, String fatherName, String motherName, String nid,
      Pixel[][] pixels) {
    if (!isValidName(fname) || !isValidName(lname) || !isValidName(fatherName) || !isValidName(motherName))
      return null;
    if (!isValidNID(nid))
      return null;
    Person p = new Person(fname, lname, fatherName, motherName, nid);
    p.setDob(null);
    p.setPixels(pixels);
    initPixel(p.getPixels());
    return p;
  }

  // Overloaded Static method to create object with mandatory fields and dob
  public static Person getPerson(String fname, String lname, String fatherName, String motherName, Date dob,
      String nid) {
    if (!isValidName(fname) || !isValidName(lname) || !isValidName(fatherName) || !isValidName(motherName))
      return null;
    if (!isValidNID(nid))
      return null;
    Person p = new Person(fname, lname, fatherName, motherName, nid);
    p.setDob(dob);
    p.setPixels(null);
    initPixel(p.getPixels());
    return p;
  }

  public static Person getPerson(String fname, String lname, String fatherName, String motherName, Date dob, String nid,
      Pixel[][] pixels) {
    if (!isValidName(fname) || !isValidName(lname) || !isValidName(fatherName) || !isValidName(motherName))
      return null;
    if (!isValidNID(nid))
      return null;
    Person p = new Person(fname, lname, fatherName, motherName, nid);
    p.setDob(dob);
    p.setPixels(pixels);
    initPixel(p.getPixels());
    return p;
  }

  private static boolean isNumeric(String num) {
    char[] c = num.toCharArray();
    for (Character x : c) {
      if (x < '0' || x > '9')
        return false;
    }
    return true;
  }

  private static void initPixel(Pixel[][] p) {
    if (p == null)
      return;
    byte b = 1;
    for (int i = 0; i < p.length; i++) {
      for (int j = 0; j < p[0].length; j++)
        p[i][j] = new Pixel(b, b, b);
    }
  }

  public static boolean isValidName(String name) {
    if (name == null || name.trim().equals(""))
      return false;
    return true;
  }

  public static boolean isValidNID(String nid) {
    if (nid == null)
      return false;
    if (nid.length() == 11 || nid.length() == 18) {
      if (isNumeric(nid))
        return true;
    }
    return false;
  }

  public String toString() {
    return "Person [fname=" + fname + ", lname=" + lname + ", fatherName=" + fatherName + ", motherName=" + motherName
        + ", dob=" + dob + ", nid=" + nid + "]";
  }

}

class Pixel {
  private byte red;
  private byte green;
  private byte blue;

  Pixel(byte r, byte g, byte b) {
    red = r;
    green = g;
    blue = b;
  }

  public String toString() {
    return "Pixel [red=" + red + ", green=" + green + ", blue=" + blue + "]";
  }
}
