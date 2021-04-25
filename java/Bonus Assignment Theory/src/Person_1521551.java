
public class Person_1521551 {

  private String name;

  private int age;

  private String nationalId;
  private String address;

  public Person_1521551(String name, int age, String nationalId, String address) {
    super();
    this.name = name;
    this.age = age;
    this.nationalId = nationalId;
    this.address = address;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getNationalId() {
    return nationalId;
  }

  public void setNationalId(String nationalId) {
    this.nationalId = nationalId;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  @Override
  public String toString() {
    return "Person [name=" + name + ", age=" + age + ", nationalId=" + nationalId + ", address=" + address + "]";
  }

}

