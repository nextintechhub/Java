
import java.math.BigInteger;
public class fact {
    BigInteger value= BigInteger.ONE;
    public void dis(){
        for (int i=2; i<=20; i++){
            value = value.multiply(BigInteger.valueOf(i));
        }
    }
    public static void main(String[] args) {
        fact f = new fact();
        f.dis();
        System.out.println("Factorial of BigInteger: "  + f.value);
    }
}






