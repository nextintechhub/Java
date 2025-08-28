
class Vechh{
    public void start(){
        System.out.println("It is a Vehicles Factory!!!");
    }
}
class Bike extends Vechh{
    public void start(){
        System.out.println("Bike Starts!!!!!");
    }
}
public class Bikeee {
    public static void main(String[] args) {
        Bike B=new Bike();
        B.start();
    }
}



