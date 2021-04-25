/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 21, 2020
 */

public class Driver_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    // shape

    Shape_1521551 s1 = new Shape_1521551(false, "Red");
    Shape_1521551 s2 = new Shape_1521551(false, "yellow");
    Shape_1521551 s3 = new Shape_1521551(false, "green");

    System.out.println(s1.toString());
    System.out.println(s2.toString());
    System.out.println(s3.toString());

    // Rectangle
    Rectangle_1521551 r1 = new Rectangle_1521551(false, "Red", 4.00, 5.00);
    Rectangle_1521551 r2 = new Rectangle_1521551(false, "yellow", 14.00, 15.00);
    Rectangle_1521551 r3 = new Rectangle_1521551(false, "green", 24.00, 25.00);

    System.out.println(r1.toString());
    System.out.println("Area of the Rectangle :" + r1.getArea());
    System.out.println("Perimeter of Rectangle:" + r1.getPerimeter());

    System.out.println(r2.toString());
    System.out.println("Area of the Rectangle :" + r2.getArea());
    System.out.println("Perimeter of Rectangle:" + r2.getPerimeter());

    System.out.println(r3.toString());
    System.out.println("Area of the Rectangle :" + r3.getArea());
    System.out.println("Perimeter of Rectangle:" + r3.getPerimeter());

    // Square
    Square_1521551 sq1 = new Square_1521551(true, "Red", 7.00);
    Square_1521551 sq2 = new Square_1521551(true, "Yellow", 8.00);
    Square_1521551 sq3 = new Square_1521551(true, "Green", 9.00);

    System.out.println(sq1.toString());
    System.out.println("Area of the Square:" + sq1.areaSquare());
    System.out.println("Peremeter of the Square:" + sq1.perimeterSquare());

    System.out.println(sq2.toString());
    System.out.println("Area of the Square:" + sq2.areaSquare());
    System.out.println("Peremeter of the Square:" + sq2.perimeterSquare());

    System.out.println(sq3.toString());
    System.out.println("Area of the Square:" + sq3.areaSquare());
    System.out.println("Peremeter of the Square:" + sq3.perimeterSquare());

  }

}
