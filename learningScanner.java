import java.util.Scanner;

public class learningScanner {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    /*
     * System.out.println("Enter the first number: ");
     * int a = s.nextInt();
     * System.out.println("Enter the second number: ");
     * int b = s.nextInt();
     * int sum = a + b;
     * System.out.println("The sum of " + a + " and " + b + " is " + sum);
     */

    System.out.println("Enter your name: ");
    String name = s.next();
    System.out.println("My name is " + name);

  }
}
