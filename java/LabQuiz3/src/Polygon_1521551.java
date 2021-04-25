
import java.util.Date;

abstract class Polygon_1521551 implements Comparable_1521551, Cloneable_1521551 {

  private RGB_1521551 color;
  private Date createdOn;
  private double lengthOfSide;

  public Polygon_1521551(RGB_1521551 color, Date createdOn, double lengthOfSide) {
    super();
    this.color = color;
    this.createdOn = createdOn;
    this.lengthOfSide = lengthOfSide;

  }

  @Override
  public int compareTo(Polygon_1521551 p1) {
    // TODO Auto-generated method stub

    if (this.computeArea() > p1.computeArea()) {

      return 1;
    } else if (this.computeArea() == p1.computeArea()) {

      return 2;
    }

    else if (this.computeArea() < p1.computeArea()) {

      return 3;
    } else {

      return -100;
    }

  }

  @Override
  public Polygon_1521551 cloned() {
    // TODO Auto-generated method stub
    System.out.println(this.color + " " + this.lengthOfSide);

    return null;
  }

  public RGB_1521551 getColor() {
    return color;
  }

  public void setColor(RGB_1521551 color) {
    this.color = color;
  }

  public Date getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(Date createdOn) {
    this.createdOn = createdOn;
  }

  public double getLengthOfSide() {
    return lengthOfSide;
  }

  public void setLengthOfSide(double lengthOfSide) {
    this.lengthOfSide = lengthOfSide;
  }

  abstract byte getNumberOfSides();

  abstract double computeArea();

  abstract String toStringPrint();

  @Override
  public String toString() {
    return toStringPrint();
  }

}





 