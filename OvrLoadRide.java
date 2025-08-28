class al{
    void  sound(){
        System.out.println("Animal says");
    }
}

class Meow extends al{
    void sound(){
        System.out.println("Meow Meow");
    }
}

class come{
    int shot(int a, int b){
        return a+b;
    }
    int shot(int a, int b, int c){
        return a+b+c;
    }
    double shot(double a, double b){
        return a+b;
    }
}

public class OvrLoadRide {
    public static void main(String[] args) {
        al x = new al();
        Meow mx = new Meow();

        x.sound();
        mx.sound();

        come mmx = new come();
        System.out.println("Sum is: " + mmx.shot(2,4));
        System.out.println("Sum is: " + mmx.shot(3,6,8));
        System.out.println("Sum is: " + mmx.shot(2.5,6.9));
    }
}
