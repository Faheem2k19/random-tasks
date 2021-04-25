package dataclass;

import exceptions.InvalidEmailException;
import exceptions.InvalidNameException;
import exceptions.InvalidPasswordException;

import utilities.Model;

public class Person {
  
  private String fname;
  private String lname;
  private String email;
  private String password;
  private String confirmPassword;

  public String getFname() {
    return fname;
  }

  public void setFname(String fname) {
    this.fname = fname;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  public Person(String fname, String lname, String email, String password, String confirmPassword)
      throws InvalidNameException, InvalidEmailException, InvalidPasswordException {
    super();
    if (fname.length() > 0) {
      this.fname = fname;
    } else {
      throw new InvalidNameException("Name is empty");
    }

    if (lname.length() > 0) {
      this.lname = lname;
    } else {
      throw new InvalidNameException("last name is empty");
    }

    if (email.length() > 0 && !(Model.toLower(email))) {
      this.email = email;
    } else {
      throw new InvalidEmailException("you should use lower case letter");
    }

    if (((password.length() > 4 && confirmPassword.length() > 4)
        && (password.length() <= 15 && confirmPassword.length() <= 15))
        && (Model.checkPassword(password, confirmPassword))) {

      this.password = password;
      this.confirmPassword = confirmPassword;

    } else {
      throw new InvalidPasswordException(
          "Password doesn't match or password shorter than 4 characters or longer than 15 characters.");
    }
  }


  @Override
  public String toString() {
    return "Person [fname=" + fname + ", lname=" + lname + ", email=" + email + ", password=" + password
        + ", confirmPassword=" + confirmPassword + "]";
  }

}
