import java.util.Scanner;

public class InchConversion {

    public static void main(String[] args) {
        // Creating a Scanner object to read user input.
        Scanner in = new Scanner(System.in);

        // Prompting the user to enter the number of inches.
        System.out.print("Enter number of inches: ");

        // Reading the number of inches entered by the user.
        int inches = in.nextInt();

        // Calling methods to convert inches to feet and yards.
        convertToFeet(inches);
        convertToYards(inches);
    }

    public static void convertToFeet(int inches) {
        // Converting inches to feet and print the result.
        System.out.println(inches + " inches is " + (inches / 12.0) + " feet.");
    }

    public static void convertToYards(int inches) {
        // Converting inches to yards and print the result.
        System.out.println(inches + " inches is " + (inches / 36.0) + " yards.");
    }
}
