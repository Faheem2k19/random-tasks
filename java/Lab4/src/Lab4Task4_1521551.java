/**
 * Name: Asiful Alam Fahim 
 * ID: 1521551 
 * Course: CSE215L.10 
 * Instructor Name: Shaikh Shawon Arefin Shimon 
 * Date: November 09, 2020
 */

public class Lab4Task4_1521551 {
  public static void main(String[] args) {
    int num1 = 115;
    int num2 = 120;
    double feetResult = 0.0;
    double meterResult = 0.0;
    boolean primeNum = false;

    System.out.println("Meters to feet:");

    for (int i = 1; i <= num1; i++) {

      primeNum = checkPrime(i);

      if (primeNum) {
        feetResult = metersToFeet(i);
        System.out.println(i + " meters " + " = " + " " + feetResult + " feet ");
      }

    }

    System.out.println("\nFeet to meters: ");

    for (int i = 0; i <= num2; i++) {

      if ((i % 4 == 0) && (i % 6 == 0)) {

        meterResult = feetToMeters(i);
        System.out.println(i + " feet " + " = " + " " + meterResult + " meters.");
      }

    }

  }

  public static boolean checkPrime(int a) {
    boolean result = false;
    if (a == 2)
      result = true;

    else {
      for (int i = 2; i < a; i++) {
        if (a % i != 0)
          result = true;
        else {
          result = false;
          break;
        }
      }
    }

    return result;

  }

  public static double metersToFeet(double meters) {
    double result = 3.279 * meters;

    return result;
  }

  public static double feetToMeters(double feet) {

    double result = 0.305 * feet;
    return result;

  }

}
