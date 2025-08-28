
import java.util.Random;
class MathOperations {
    public static void main(String[] args) {
        double num = 64.0;
        System.out.println("Square root of " + num + " is: " + Math.sqrt(num));
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        System.out.println("Random number between 1 and 100: " + randomNumber);

        int num1 = 50;
        int num2 = 75;
        System.out.println("Maximum of " + num1 + " and " + num2 + " is: " + Math.max(num1, num2));
        System.out.println("Minimum of " + num1 + " and " + num2 + " is: " + Math.min(num1, num2));
    }
}
