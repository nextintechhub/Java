
public class car {
    private static int a = 0;

    public car(){
        a++;
    }

    public static int getA(){
        return a;
    }

    public static void main(String[] args) {
        car c = new car();
        car cc = new car();
        car ccc = new car();

        System.out.println("Number of Car objects created: " + car.getA());
    }
}



