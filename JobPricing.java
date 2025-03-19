import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		String description;
		double materials;
		double hoursOnJob;
		double hoursTravelling;
		double price;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter job description >> ");
		description = input.nextLine();
		System.out.print("Enter cost of materials >> ");
		materials = input.nextDouble();
		System.out.print("Enter hours on the job work >> ");
		hoursOnJob = input.nextDouble();
		System.out.print("Enter hours traveling >> ");
		hoursTravelling = input.nextDouble();
		price = computePrice(materials, hoursOnJob, hoursTravelling);
		System.out.println("THe price for "+description+" is $"+price);
	}
	public static double computePrice(double materials, double hoursOnJob, double hoursTravelling)
	{
	    return (materials + 35*hoursOnJob + 15*hoursTravelling);
	}
}
