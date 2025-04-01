import java.util.Scanner;

class Lease {
    // Fields
    private String tenantName;
    private double rent;
    private boolean hasPets;
    private double petFee;

    // Default constructor
    public Lease() {
        tenantName = "Default Tenant";
        rent = 1000.00; // Default rent
        hasPets = false;
        petFee = 0.00;
    }

    // Parameterized constructor
    public Lease(String tenantName, double rent, boolean hasPets) {
        this.tenantName = tenantName;
        this.rent = rent;
        this.hasPets = hasPets;
        this.petFee = hasPets ? 100.00 : 0.00; // If tenant has pets, add a pet fee
    }

    // Method to get data from the user
    public static Lease getData() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter tenant name: ");
        String tenantName = scanner.nextLine();
        
        System.out.print("Enter rent amount: ");
        double rent = scanner.nextDouble();
        
        System.out.print("Does the tenant have pets? (true/false): ");
        boolean hasPets = scanner.nextBoolean();
        
        return new Lease(tenantName, rent, hasPets);
    }

    // Method to display lease values
    public void showValues() {
        System.out.println("Tenant Name: " + tenantName);
        System.out.println("Rent: $" + rent);
        System.out.println("Has Pets: " + (hasPets ? "Yes" : "No"));
        System.out.println("Pet Fee: $" + petFee);
    }

    // Method to add a pet fee to rent
    public void addPetFee() {
        if (hasPets && petFee > 0) {
            rent += petFee;
            System.out.println("Pet fee of $" + petFee + " has been added to the rent.");
        }
    }
}

public class TestLease {
    public static void main(String[] args) {
        // Create four Lease objects
        Lease lease1, lease2, lease3, lease4;

        // Get lease data from the user and assign to lease1, lease2, and lease3
        lease1 = Lease.getData();
        lease2 = Lease.getData();
        lease3 = Lease.getData();

        // Fourth Lease object will have default values
        lease4 = new Lease();

        // Display lease1 details
        System.out.println("\nShowing initial lease1 values:");
        lease1.showValues();

        // Add pet fee to lease1 and display updated values
        lease1.addPetFee();

        // Show updated lease1 values
        System.out.println("\nAfter adding pet fee to lease1:");
        lease1.showValues();

        // Display values for lease2, lease3, and lease4
        System.out.println("\nLease2 details:");
        lease2.showValues();

        System.out.println("\nLease3 details:");
        lease3.showValues();

        System.out.println("\nLease4 details (should show default values):");
        lease4.showValues();
    }
}
