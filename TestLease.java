import java.util.Scanner;

public class TestLease {
    public static void main(String[] args) {
        // Declare four Lease objects
        Lease lease1, lease2, lease3, lease4;

        // Initialize lease1, lease2, and lease3 using the getData() method
        lease1 = getData();
        lease2 = getData();
        lease3 = getData();

        // Initialize lease4 using the default constructor
        lease4 = new Lease();

        // Display the data for lease1
        showValues(lease1);

        // Add a pet fee and show the explanation
        lease1.addPetFee();

        // Display the updated data for lease1
        System.out.println("\nAfter adding the pet fee:");
        showValues(lease1);

        // Show values for the other three Lease objects (lease2, lease3, and lease4)
        System.out.println("\nLease 2 values:");
        showValues(lease2);

        System.out.println("\nLease 3 values:");
        showValues(lease3);

        System.out.println("\nLease 4 values (using default constructor):");
        showValues(lease4);
    }

    // Method to prompt user for input and return a newly constructed Lease object
    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);

        // Create a new Lease object
        Lease lease = new Lease();

        // Get the tenant's name
        System.out.print("Enter tenant name: ");
        lease.setTenantName(scanner.nextLine());

        // Get the apartment number
        System.out.print("Enter apartment number: ");
        lease.setApartmentNumber(scanner.nextInt());

        // Get the monthly rent
        System.out.print("Enter monthly rent: ");
        lease.setMonthlyRent(scanner.nextDouble());

        // Get the lease term in months
        System.out.print("Enter lease term in months: ");
        lease.setLeaseTerm(scanner.nextInt());

        // Consume the leftover newline character
        scanner.nextLine();

        return lease;
    }

    // Method to display the values of a Lease object
    public static void showValues(Lease lease) {
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: $" + lease.getMonthlyRent());
        System.out.println("Lease Term: " + lease.getLeaseTerm() + " months");
    }
}
