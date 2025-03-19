public class FormLetterWriter {

    public static void main(String[] args) {

        displaySalutation("John");
        displayLetter();
        displaySalutation("Maria");
        displayLetter();
        displaySalutation("Greta", "Gerwig");
        displayLetter();
        displaySalutation("Hayao", "Miyazaki");
        displayLetter();

    }

    public static void displaySalutation(String lastName) {

        System.out.println("Dear Mr. or Ms. " + lastName);

    }

    public static void displaySalutation(String firstName, String lastName) {

        // Note the space between the first and last name.
        System.out.println("Dear " + firstName + " " + lastName );

    }

    public static void displayLetter() {

        System.out.println("Thank you for your recent order.");

    }

}
