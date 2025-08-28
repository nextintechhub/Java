
import java.util.Scanner;
public class nextin {
    public static void main(String[] args) {
        Scanner nit = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name = nit.nextLine();
        System.out.println("Enter Your Age: ");
        int Age = nit.nextInt();
        System.out.println(Name);
        System.out.println(Age);
        System.out.println("Welcome To Java Class !!");
    }
}