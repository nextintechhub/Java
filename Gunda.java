import java.util.Scanner;

public class Gunda {
    String Name;
    int age;
    String C;
   public void real(String a, int age, String b){
        this.Name=a;
        this.age=age;
        this.C=b;
    }
   public void fake(){
        System.out.println(Name);
        System.out.println(age);
        System.out.println(C);
    }
    public static void main(String[] args) {
        Gunda mula = new Gunda();
        Scanner show = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String Name = show.nextLine();
        System.out.println("Enter Your Address: ");
        String C=show.nextLine();
        System.out.println("Enter Your Age: ");
        int age = show.nextInt();
        mula.real(Name,age,C);
        mula.fake();
    }
}
