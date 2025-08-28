import java.util.Scanner;

public class Hero {
    String name;
    int age;
    String address;

    void real(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    void fake() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
    }

    public static void main(String[] args) {
        Hero Gunda = new Hero();
        Scanner sh = new Scanner(System.in);

        System.out.println("Enter Your Name: ");
        String Name = sh.nextLine();
        System.out.println("Enter Your Age: ");
        int Age = sh.nextInt();
        System.out.println("Enter Your Address: ");
        String Address = sh.nextLine();

        Gunda.real(Name, Age, Address);

    }
}
