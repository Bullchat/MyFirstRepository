import java.util.Scanner;

//Declare a Java class named "BookBilling".
public class BookBilling
{
    //Declare a method named "computeBill()" with no parameter.
    public static double computeBill()
    {
        //computes the price of one photo book at $14.99, adds 8 percent tax, and returns the total due.
        return 14.99+14.99*0.08;
    }

    //Declare a method named "computeBill()" with one parameter.
    public static double computeBill(int quantity_ordered)
    {
        //computes the price of one photo book at $14.99, adds 8 percent tax, and returns the total due.
        return (14.99*quantity_ordered)+(quantity_ordered*14.99)*0.08;
    }
    
    //Declare a method named "computeBill()" with two parameters.
    public static double computeBill(int quantity_ordered,double coupon_value)
    {
        //computes the price of one photo book at $14.99, adds 8 percent tax, and returns the total due.
        double total_due=(14.99*quantity_ordered)-coupon_value;
        
        //Return total due
        return total_due+total_due*0.08;
    }
    
    //Declare a Java method named "main()".
    public static void main(String[] args) 
    {
        //Declare a object of Scanner class.
	    Scanner book_scanner=new Scanner(System.in);
	    
	    //Prompt the user for quantity ordered.
	    System.out.print("Enter quantity ordered >> ");
	    
	    //Read the quantity ordered.
	    int quantity_ordered=book_scanner.nextInt();
	    
	    //Prompt the user for coupon value.
	    System.out.print("Enter coupon value >> ");
	    
	    //Read the coupon value.
	    double coupon_value=book_scanner.nextDouble();
	    
	    //Call method computeBill().
	    System.out.println("One book is $"+computeBill());
	    
	     //Call method computeBill().
	    System.out.println(quantity_ordered+" books with no coupon are $"+computeBill(quantity_ordered));
	    
	     //Call method computeBill().
	    System.out.println(quantity_ordered+" books with a coupon worth $"+coupon_value+" are $"+computeBill(quantity_ordered,coupon_value));

	}//end of the main() method.
}//end of the class BookBilling.
