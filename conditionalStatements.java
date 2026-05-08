import java.util.Scanner;

public class conditionalStatements {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    // If Statement

    System.out.println("Enter a number: ");
    int a = s.nextInt();

    if (a >= 10) {
      System.out.println("The number is greater than or equal to 10.");
    }

    // If-else Statement

    System.out.println("Enter a number once again: ");
    int b = s.nextInt();

    if (b >= 0) {
      System.out.println("It's a positive number");
    } else {
      System.out.println("It's a negative number");
    }

    // If-else-if statement

    System.out.println("Enter the third number: ");
    int c = s.nextInt();

    if (c >= 0 && c <= 10) {
      System.out.println("C is a single digit number");
    } else if (c >= 11 && c <= 100) {
      System.out.println("C is a double digit number");
    } else {
      System.out.println("C is a triple or bigger digit number");
    }

    // Nested if statement
    System.out.println("Enter your age: ");
    int age = s.nextInt();
    boolean hasExperience = true;

    if (age >= 21) {
      if (hasExperience) {
        System.out.println("Eligible for senior role");
      } else {
        System.out.println("Eligible for junior role");
      }
    } else {
      System.out.println("Not eligible");
    }

    // Ternary operator
    int salary = 12;
    String result = (salary >= 10) ? "Target met" : "Not yet";
    System.out.println(result);

    s.close();
  }
}
