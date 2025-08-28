
public class DivisionHandler {
    public double divide(int a, int b) {
        return (double) a / b;
    }
    public static void main(String[] args) {
        DivisionHandler division = new DivisionHandler();
        try {
            int a = 10;
            int b = 0;
            double result = division.divide(a, b);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}
