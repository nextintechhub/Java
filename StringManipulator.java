
import java.util.Scanner;
class StringManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String uppercaseString = inputString.toUpperCase();
        String modifiedString = uppercaseString.replace('A', '@');

        System.out.println("Modified string: " + modifiedString);
        scanner.close();
    }
}
