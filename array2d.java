
import java.util.Scanner;

public class array2d {
    int x, y;

    void d(int a, int b) {
        this.x = a;
        this.y = b;
        int[][] array = new int[a][b];
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values of the 2D array: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = s.nextInt();
            }
        }
        System.out.println("The 2D array in matrix form is: ");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        array2d a = new array2d();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int x = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int y = sc.nextInt();
        a.d(x, y);
    }
}
