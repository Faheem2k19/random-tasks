
public class Shape_1521551 {

  private boolean filled;
  private String color;

  public Shape_1521551(boolean filled, String color) {
    super();
    this.filled = filled;
    this.color = color;
  }

  public boolean isFilled() {
    return filled;
  }

  public void setFilled(boolean filled) {
    this.filled = filled;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Shape_1521551 :filled=" + filled + ", color=" + color;
  }

}
