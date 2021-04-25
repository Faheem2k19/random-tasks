
public class classwork4 {

  public static void main(String[] args) {
    int number1 = 5, number2 = 10;

    // calling the method
    int sum = sum(number1, number2);
    System.out.println(sum);
  }

  // method declaration within the scope of the class
  public static int sum(int a, int b) {
    return a + b;
  }
}
