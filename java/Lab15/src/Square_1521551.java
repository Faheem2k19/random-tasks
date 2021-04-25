
public class Square_1521551 extends Shape_1521551 {

  private double sideLenth;

  public Square_1521551(boolean filled, String color, double sideLenth) {
    super(filled, color);
    // TODO Auto-generated constructor stub

    this.sideLenth = sideLenth;
  }

  public double areaSquare() {
    return (sideLenth * sideLenth);
  }

  public double perimeterSquare() {
    return (sideLenth + sideLenth + sideLenth + sideLenth);
  }

  public double getSideLenth() {
    return sideLenth;
  }

  public void setSideLenth(double sideLenth) {
    this.sideLenth = sideLenth;
  }

  @Override
  public String toString() {
    return "Square_1521551 : sideLenth=" + sideLenth;
  }

}
