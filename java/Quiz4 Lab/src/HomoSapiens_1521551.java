
abstract class HomoSapiens_1521551
    implements InvalidWeightOrHeightException_1521551, InvalidBloodGroupException_1521551 {

  private double height;
  private double weight;
  private String bloodGroup;

  public HomoSapiens_1521551(double height, double weight, String bloodGroup) {
    super();

    if (height > 0) {
      this.height = height;
    } else {
      this.printH();
    }
    if (weight > 0) {
      this.weight = weight;
    } else {
      this.printH();
    }
    if (bloodGroup == "A+" || bloodGroup == "A-" || bloodGroup == "B+" || bloodGroup == "B-" || bloodGroup == "O+"
        || bloodGroup == "O-" || bloodGroup == "AB+" || bloodGroup == "AB-") {

      this.bloodGroup = bloodGroup;
    } else {
      this.printB();
    }

  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public String getBloodGroup() {
    return bloodGroup;
  }

  public void setBloodGroup(String bloodGroup) {
    this.bloodGroup = bloodGroup;
  }

  @Override
  public void printB() {
    // TODO Auto-generated method stub

    System.out.println("Invalid Blood Group");
  }

  @Override
  public void printH() {
    // TODO Auto-generated method stub
    System.out.println("Invalid Hight.");

  }

  @Override
  public String toString() {
    return "HomoSapiens_1521551 [height=" + height + ", weight=" + weight + ", bloodGroup=" + bloodGroup + "]";
  }

}

