import java.util.Scanner;

public class EvenOdd {

    // Method to check if the number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter an integer
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        
        // Call the isEven method to check if the number is even
        boolean isEven = isEven(num);
        
        // Display the result
        if (isEven) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
