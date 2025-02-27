import java.util.Scanner;

public class DebugTwo2 {
   public static void main(String args[]) {
      int a, b;
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter an integer >> ");
      a = input.nextInt(); // Corrected: used input.nextInt()
      
      System.out.print("Enter another integer >> ");
      b = input.nextInt(); // Corrected: used input.nextInt()
      
      System.out.println("The sum is " + (a + b)); // Corrected: used println instead of print1n
      System.out.println("The difference is " + (a - b));
      System.out.println("The product is " + (a * b));
   }
}
