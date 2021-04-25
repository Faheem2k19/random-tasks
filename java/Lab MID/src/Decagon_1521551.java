import java.util.Date;
import java.util.Date;

public class Decagon_1521551 {

  private float side;

  private RGB_1521551 color;

  private Date createdOn;

  public Decagon_1521551(float side, RGB_1521551 color, Date createdOn) {
    super();
    this.side = side;
    this.color = color;
    this.createdOn = createdOn;
  }

  public Decagon_1521551(float side) {
    super();
    this.side = side;

  }

  public double getArea() {
    double A;
    double b = Math.sqrt(4) * Math.sqrt(5);
    A = 10 / 4 * (Math.sqrt(5 + b) * Math.sqrt(this.side * this.side * this.side * this.side));

    return A;
  }

  public float getSide() {
    return side;
  }

  public void setSide(float side) {
    this.side = side;
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

  @Override
  public String toString() {
    return "The particular Decagon has a length of side of " + side + "units" + ",has the  color=" + color
        + ", was createdOn= " + createdOn + "has an area of " + this.getArea() + "units";
  }

}
