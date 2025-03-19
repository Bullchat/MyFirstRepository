import java.util.Scanner;

class PaintCalculator {
    public static void main(String[] args) {
           double wallArea;
           double length;
           double width;
           double height;
           double price;
           Scanner keyboard = new Scanner(System.in);
           
           //promt the user for input of length, width, height and take input  
           System.out.print("Please enter the length of the room: ");
           length = keyboard.nextDouble();

           System.out.print("Please enter the width of the room: ");
           width = keyboard.nextDouble();

           System.out.print("Please enter the height of the room: ");
           height = keyboard.nextDouble();
           
           //send the length,width and height values as parameters to CalculatePrice() method to calculate price
           price = CalculatePrice(length,width,height);
           
           //print the value of price
           System.out.println("Price of the paint is $"+price);
    }
    
    //This is the method that calculates price of the paint
    public static double CalculatePrice(double length, double width, double height){
            //declare variables
            double wallArea, paintQuantity, price;
            //calculate wall area and store the value in variable wallArea
            wallArea = 2 * (length + width) * height;
            
            //send this wallArea as parameter to ClaculatePaintQty() method that calculates and returns the quantity of paint in gallons 
            paintQuantity = ClaculatePaintQty(wallArea);
            
            //print the paint Quantity
            System.out.println("For a room of height " + height + "feet, length " +
            length + " feet, and width " + width + " feet you need to purchase "
            + paintQuantity + " gallons of paint.");
            
            //calculate the price by multiplying paintQuantity and 32
            price = paintQuantity*32.0;
            
            //return price to the calling function
            return price;
    }
    public static double ClaculatePaintQty(double wallArea){
        double paintQuantity = wallArea/350;
        return paintQuantity;
    }
}
