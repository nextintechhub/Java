
import java.util.Scanner;

public class nextinn {
    void dis(int r, float PI){
        float res = PI * r * r;
        System.out.println("Area of circle: " +res);
    }

    public static void main(String[] args) {
        nextinn nit = new nextinn();
        Scanner sc = new Scanner(System.in);
        final float PI = 3.14f;
        System.out.println("Enter the Radius of circle: ");
        int r = sc.nextInt();
        System.out.println("Area = PI*r*r");
        nit.dis(r,PI);
    }
}
