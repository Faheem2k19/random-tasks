
import java.util.Arrays;

public class RGB_1521551 {

  private short[] rgbColorArray;

  private short red;
  private short green;
  private short blue;

  public RGB_1521551(short[] rgbColorArray) {
    super();
    this.rgbColorArray = rgbColorArray;
  }

  public RGB_1521551(short red, short green, short blue) {
    super();
    this.red = red;
    this.green = green;
    this.blue = blue;
  }

  @Override
  public String toString() {
    return "RGB : red=" + red + ", green=" + green + ", blue=" + blue;
  }

  public String toStringPrint() {
    return "RGB: =" + this.rgbColorArray;
  }

}