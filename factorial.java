
import java.util.Scanner;
class fac {
    public int fact(int n){
        if (n==0){
            return 1;
        }
        else {
            return fact(n-1) * n;
        }
    }
}
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        fac obj=new fac();
        System.out.println("Enter Your Factorial Number: ");
        int num=sc.nextInt();
        System.out.println("Factorial Number is " + obj.fact(num));
        sc.close();
    }
}




