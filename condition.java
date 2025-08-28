import java.util.Scanner;

public class condition {

    public static void main(String[] args) {
        Scanner cond = new Scanner(System.in);
        int a = cond.nextInt();

        if (a>19) {
            System.out.println("A is Greater");
        }
        else {
            System.out.println("B is Greater");
        }

    }
}