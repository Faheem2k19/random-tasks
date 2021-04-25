
public class Rectangle_1521551 extends Shape_1521551 {

  private double width;
  private double lenth;

  public Rectangle_1521551(boolean filled, String color, double width, double lenth) {
    super(filled, color);
    // TODO Auto-generated constructor stub

    this.width = width;
    this.lenth = lenth;

  }

  public double getArea() {

    return (0.5 * width * lenth);

  }

  public double getPerimeter() {
    return (2 * (width + lenth));
  }

  @Override
  public String toString() {
    return "Rectangle_1521551: width=" + width + ", lenth=" + lenth + "filled " + this.isFilled() + "Color : "
        + this.getColor();

  }

}
