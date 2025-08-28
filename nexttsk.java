
import java.util.Scanner;
public class nexttsk{
    int a, b, c;
    void show(int a, int b){
        this.a = a;
        this.b = b;
        c = a+b;
        System.out.println("Add: " + c);
        c = a-b;
        System.out.println("Sub: " + c);
        c = a*b;
        System.out.println("Multiply: " + c);
        c = a/b;
        System.out.println("Division: " + c);
        c = a%b;
        System.out.println("Modulus: " + c);
    }
    public static void main(String[] args) {
        nexttsk nxt = new nexttsk();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Number: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        nxt.show(a, b);
    }
}


