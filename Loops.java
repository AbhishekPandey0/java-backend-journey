import java.util.Scanner;

public class Loops {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    // FOR LOOP
    for (int i = 0; i <= 5; i++) {
      System.out.print(i + ", ");
    }

    // WHILE LOOP
    int i = 1;
    while (i <= 5) {
      System.out.print(i + ", ");
      i++;
    }

    // DO WHILE LOOP - ALways runs atleast once
    int j = 1;
    do {
      System.out.println(j + ", ");
      j++;
    } while (j <= 5);

    // BREAK & CONTINUE
    for (int a = 0; a <= 10; a++) {
      if (a == 6)
        break; // stops loop at 6
      if (a % 2 == 0)
        continue; // skips even numbers
      System.out.println(a);
    }

    // EXERCISE
    System.out.println("Enter a number: ");
    int num = s.nextInt();

    for (int k = 1; k <= num; k++) {
      if (k % 2 == 0) {
        System.out.println(k + " Even ");
      } else {
        System.out.println(k + " Odd ");
      }
    }
  }
}
