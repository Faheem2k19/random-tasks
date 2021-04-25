
public class Person_1521551 extends HomoSapiens_1521551
    implements InvalidNameException_1521551, InvalidAgeException_1521551, NullDataException_1521551,
    InvalidContactNumberException_1521551, InvalidGenderException_1521551 {

  private String firstName;
  private String lastName;
  private String nationalId;
  private Address_1521551 Address_1521551;
  private String contactNo;
  private String gender;

  public Person_1521551(double height, double weight, String bloodGroup, String firstName, String lastName,
      String nationalId, Address_1521551 Address_1521551, String contactNo, String gender) {
    super(height, weight, bloodGroup);

    if (firstName.length() >= 4) {
      this.firstName = firstName;
    } else {
      this.printNam();
    }

    if (lastName.length() >= 4) {
      this.lastName = lastName;
    } else {
      this.printNam();
    }

    this.nationalId = nationalId;
    this.Address_1521551 = Address_1521551;

    if (contactNo.contains("+880") && contactNo.length() == 14) {
      this.contactNo = contactNo;
    } else {
      this.printCon();
    }
    if (gender.equals("MALE") || gender.equals("FEMALE")) {
      this.gender = gender;
    } else {
      this.prinGen();
    }

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

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public Address_1521551 getAddress_1521551() {
    return Address_1521551;
  }

  public void setAddress_1521551(Address_1521551 Address_1521551) {
    this.Address_1521551 = Address_1521551;
  }

  public String getContactNo() {
    return contactNo;
  }

  public void setContactNo(String contactNo) {
    this.contactNo = contactNo;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  @Override
  public void printB() {
    // TODO Auto-generated method stub
    System.out.println("You enter invalid blood group.");
  }

  @Override
  public String toString() {
    return "Weight = " + this.getWeight() + " Height =  " + this.getHeight() + " Blood Group = " + this.getBloodGroup()
        + " Person_1521551 [firstName=" + firstName + ", lastName=" + lastName + ", nationalId=" + nationalId
        + ", Address_1521551=" + Address_1521551 + ", contactNo=" + contactNo + ", gender=" + gender + "]";
  }

  @Override
  public void printH() {
    // TODO Auto-generated method stub
    System.out.println("Invalid HightOrWeight.");
  }

  @Override
  public void prinGen() {
    // TODO Auto-generated method stub
    System.out.println("You enter invalid Gender.");
  }

  @Override
  public void printCon() {
    // TODO Auto-generated method stub
    System.out.println("You enter invalid contact Number.");
  }

  @Override
  public void printNull() {
    // TODO Auto-generated method stub
    System.out.println("You enter invalid NullData.");
  }

  @Override
  public void printAge() {
    // TODO Auto-generated method stub
    System.out.println("You enter invalid Age.");
  }

  @Override
  public void printNam() {
    // TODO Auto-generated method stub
    System.out.println("You enter invalid Name.");
  }

}
