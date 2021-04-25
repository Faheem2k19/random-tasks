/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 Course: CSE215.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: Dec 07, 2020
 */
class QuadraticEquation_1521551 {
  private static double a;
  private static double b;
  private static double c;

  QuadraticEquation_1521551(double A, double B, double C) {
    a = A;
    b = B;
    c = C;
  }

  public double getA() {
    return a;
  }

  public double getB() {
    return b;
  }

  public double getC() {
    return c;
  }

  double getDiscriminant() {
    return (Math.pow(b, 2.0) - (4 * a * c));
  }
  
  public double evaluateDiscriminant() {
    
    if (getDiscriminant() > 0) {
      System.out.println("Two distinct solutions");
    }
    
    if (getDiscriminant() == 0) {
      System.out.println("One unique solution");
    }
    
    
    if (getDiscriminant() < 0) {
      System.out.println("No real solutions");
    }
    return getDiscriminant();
  }

  public double getRoot1() {
    return (-b + getDiscriminant()) / 2 * 4;
  }

  public double getRoot2() {
    return (-b + getDiscriminant()) / 2 * 4;
  }
}
