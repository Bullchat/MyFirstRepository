import java.util.Scanner;

public class BookstoreCredit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        // Prompt the user for their GPA
        System.out.print("Enter your GPA: ");
        double gpa = input.nextDouble();

        // Display the descriptive message
        displayBookstoreCredit(name, gpa);

        input.close();
    }

    // Method to display the descriptive message
    public static void displayBookstoreCredit(String name, double gpa) {
        double credit = gpa * 10;
        System.out.printf("%s, your GPA is %.2f, so your credit is $%.2f%n", name, gpa, credit);
    }
}
