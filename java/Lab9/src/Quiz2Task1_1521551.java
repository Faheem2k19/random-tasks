
c
import java.util.Scanner;

public class Quiz2Task1_1521551 {

  public static void main(String[] args) {
    // TODO Auto-generated method stub

    Scanner input = new Scanner(System.in);

    double arr[][] = new double[8][7];

    arr = generateMatrix();
    findIndices(arr);

  }

  public static double[][] generateMatrix()

  {
    Scanner input = new Scanner(System.in);
    double matrix[][] = new double[8][7];
    System.out.println("Enter an array size 8*7:");
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 7; j++) {
        matrix[i][j] = input.nextDouble();
      }
    }

    return matrix;

  }

  public static void findIndices(double matrix[][])

  {
    double sum = 0.0;
    int indices = 0;
    for (int i = 0; i < 7; i++) {
      for (int j = i; j < 8; j++) {
        sum += matrix[j][i];
        indices = i;
      }
      if (sum < 30.5 && sum > 20.2) {
        System.out.println("The column index where column sum is greater than 20.2 and less 30.5 is: " + indices);
        sum = 0.0;
      } else {
        sum = 0.0;
      }
    }
  }
}
