import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a double : ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter another double : ");
        double num2 = scanner.nextDouble();

        computePercent(num1, num2);
        computePercent(num2, num1);
    }

    public static void computePercent(double num1, double num2) {
        double percentage = (num1 / num2) * 100;
        System.out.println(num1 + " is " + percentage + " percent of " + num2);
    }
}
