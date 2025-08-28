import java.util.Scanner;

public class nextintech {

    public static void main(String[] args) {
        Scanner nit = new Scanner(System.in);

        System.out.println("Enter The Name of Company: ");
        String Company_Name = nit.nextLine();

        System.out.println("Enter The CEO Name: ");
        String CEO_Name = nit.nextLine();

        System.out.println("Enter The Address of Company: ");
        String Address = nit.nextLine();

        System.out.println("Enter The Email Address of Company: ");
        String Email_Address = nit.nextLine();

    System.out.println(Company_Name);
    System.out.println(CEO_Name); 
    System.out.println(Address);
    System.out.println(Email_Address);

    }
}