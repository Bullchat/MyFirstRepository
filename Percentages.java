import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two double values separated by space: ");
        double a = input.nextDouble();
        double b = input.nextDouble();

        showPercentage(a, b);
        showPercentage(b, a);
    }

    static void showPercentage(double x, double y) {
        System.out.printf("%.2f is %.2f%% of %.2f%n", x, (x / y) * 100, y);
    }
}
