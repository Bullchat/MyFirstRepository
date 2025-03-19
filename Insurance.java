import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        System.out.print("Enter your gender (M/F): ");
        char gender = scanner.next().charAt(0);

        int agePremium = AgePremium(currentYear, birthYear);

        double totalPremium = TotalPremium(agePremium, gender);

        System.out.println("\nUser Information:");
        System.out.println("Current Year: " + currentYear);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Gender: " + gender);
        System.out.println("Age Premium: $" + agePremium);
        System.out.println("Total Premium: $" + totalPremium);
    }

    public static int AgePremium(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        int ageDecade = age / 10;
        return (ageDecade + 15) * 20;
    }

    public static double TotalPremium(int agePremium, char gender) {
        double totalPremium = agePremium;

        if (Character.toUpperCase(gender) == 'M') {
            totalPremium *= 1.015;
        }

        return totalPremium;
    }
}
