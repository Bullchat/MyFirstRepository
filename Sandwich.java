public class Sandwich {
    String mainIngredient;
    String breadType;
    double price;

    public Sandwich(String mainIngredientParam, String breadTypeParam, double priceParam) {
        mainIngredient = mainIngredientParam;
        breadType = breadTypeParam;
        price = priceParam;
    }

    public void displayInfo() {
        System.out.println("Main Ingredient: " + mainIngredient);
        System.out.println("Bread Type: " + breadType);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Sandwich sandwich = new Sandwich("Ham", "White", 4.50);
        sandwich.displayInfo();
    }
}
