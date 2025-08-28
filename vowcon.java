
import java.util.Scanner;
public class vowcon {
    vowcon(char a){
        if ((a>='A'&& a<='Z') || (a>='a' && a<='z')){
            switch(a){
                case 'a':
                    System.out.println("Provided alphabet is vowel");
                    break;
                case 'e':
                    System.out.println("Provided alphabet is vowel");
                    break;
                case 'i':
                    System.out.println("Provided alphabet is vowel");
                    break;
                case 'o':
                    System.out.println("Provided alphabet is vowel");
                    break;
                case 'u':
                    System.out.println("Provided alphabet is vowel");
                    break;
                default:
                    System.out.println("Provided alphabet is Constant");
            }}
        else {
            System.out.println("Please provide an alphabet");
        }}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char a = sc.next().charAt(0);
        vowcon v = new vowcon(a);
    }}






