
import java.util.Date;

public class Decagon_1521551 extends Polygon_1521551 {

  private final byte NUMBER_OF_SIDE = 10;

  public Decagon_1521551(RGB_1521551 color, Date createdOn, double lengthOfSide) {
    super(color, createdOn, lengthOfSide);
    // TODO Auto-generated constructor stub
  }

  @Override
  byte getNumberOfSides() {
    // TODO Auto-generated method stub
    return this.NUMBER_OF_SIDE;
  }

  @Override
  double computeArea() {
    // TODO Auto-generated method stub
    double A;
    A = (5 / 2) * Math.pow(this.getLengthOfSide(), 2) * Math.sqrt((5 + 2 * Math.sqrt(5)));
    return A;
  }

  @Override
  String toStringPrint() {
    // TODO Auto-generated method stub
    return ("The Type Of the Object: Decagon " + " Date: " + this.getCreatedOn() + " RGB Colors: " + this.getColor()
        + "Total Number Of Sides: " + this.NUMBER_OF_SIDE);
  }

}
