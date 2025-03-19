public class NumbersDemo {
  public static void main(String args[]) {
  int num1 = 6;
  int num2 = 44;

  displayTwiceTheNumber(num1);
  displayNumberPlusFive(num1);
  displayNumberSquared(num1);

  displayTwiceTheNumber(num2);
  displayNumberPlusFive(num2);
  displayNumberSquared(num2);
  }

  public static void displayTwiceTheNumber(int num) {
  int result = num * 2;
  System.out.println(num + " times 2 is " + result);
  }

  public static void displayNumberPlusFive(int num) {
  int result = num + 5;
  System.out.println(num + " plus 5 is " + result);
  }

  public static void displayNumberSquared(int num) {
  int result = num * num;
  System.out.println(num + " squared is " + result);
  }
}
