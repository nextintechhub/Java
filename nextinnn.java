
import java.util.Scanner;

public class nextinnn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Floating Point :");
        double value = sc.nextDouble();
        System.out.println("Convert to Double to Int :");
        int c_value=(int)value;
        System.out.println("Integer Value " + c_value);
        System.out.println("Original Value Like Double : "+value);
        sc.close();
    }
}
