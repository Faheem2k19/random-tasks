import java.util.*;
import java.io.*;
import java.text.*;
import java.lang.Math;

class QuadraticEquationDriver_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    double a = 0.0;
    double b = 0.0;
    double c = 0.0;

    DecimalFormat df = new DecimalFormat("##.##");

    Scanner input = new Scanner(System.in);
    System.out.print("Enter value of a: ");
    String x = input.next();
    a = Double.parseDouble(x);

    System.out.print("Enter value of b: ");
    x = input.next();
    b = Double.parseDouble(x);

    System.out.print("Enter value of c: ");
    x = input.next();
    c = Double.parseDouble(x);

    QuadraticEquation_1521551 qe = new QuadraticEquation_1521551(a, b, c);

    if (qe.getDiscriminant() > 0) {
      System.out.println("Discriminant= " + df.format(qe.getDiscriminant()));
      System.out.println(qe.evaluateDiscriminant());
      System.out.println("First root= " + df.format(qe.getRoot1()));
      System.out.println("Second root= " + df.format(qe.getRoot2()));
    }

    if (qe.getDiscriminant() == 0) {
      System.out.println("Discriminant= " + df.format(qe.getDiscriminant()));
      System.out.println(qe.evaluateDiscriminant());
      System.out.println("root= " + df.format(qe.getRoot1()));
    }

    if (qe.getDiscriminant() < 0) {
      System.out.println(qe.evaluateDiscriminant());
    }

  }

}
