import java.util.Scanner;

public class DebugThree3 {
   public static void main(String args[]) {
      String name;
      name = getName();  // Added semicolon
      displayGreeting(name);  // Fixed variable name
   }

   public static String getName() {  // Removed 'void'
      String name;
      Scanner input = new Scanner(System.in);
      System.out.print("Enter name: ");  // Corrected to System.out.print
      name = input.nextLine();  // Fixed typo to nextLine()
      input.close();  // Close scanner to prevent resource leak
      return name;  // Return the correct variable
   }

   public static void displayGreeting(String name) {  // Added 'void' return type
      System.out.println("Hello, " + name + "!");  // Fixed typo
   }
}
