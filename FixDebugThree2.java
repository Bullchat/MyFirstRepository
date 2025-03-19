import java.util.Scanner;

public class DebugThree2 {
   public static void main(String args[]) {
      int a, b, c;
      Scanner input = new Scanner(System.in);

      // Correct variable assignment for inputs
      System.out.print("Enter an integer >> ");
      a = input.nextInt();

      System.out.print("Enter a second integer >> ");
      b = input.nextInt();

      System.out.print("Enter a third integer >> ");
      c = input.nextInt();

      // Call add and subtract methods
      add(a, b);
      add(b, c);
      add(a, c);

      subtract(a, b);
      subtract(b, c);
      subtract(a, c);

      input.close();  // Close scanner
   }

   public static void add(int a, int b) {
      int sum = a + b;  // Calculate the sum
      System.out.println("The sum of " + a + " and " + b + " is " + sum);
   }

   public static void subtract(int a, int b) {
      int difference = a - b;  // Calculate the difference
      System.out.println("The difference between " + a + " and " + b + " is " + difference);
   }
}
