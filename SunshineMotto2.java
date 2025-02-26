public class SunshineMotto2 {
    public static void main(String[] args) {
        String motto = "Sunshine is the best medicine!";
        
        // Create the border based on the length of the motto
        String border = "";
        for (int i = 0; i < motto.length() + 4; i++) {
            border += "S";
        }
        
        // Print the border
        System.out.println(border);
        
        // Print the motto with border padding
        System.out.println("S " + motto + " S");
        
        // Print the border again
        System.out.println(border);
    }
}
