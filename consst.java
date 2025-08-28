
class Vehicles{
    public Vehicles(){
        System.out.println("I am a Super Constructor!!!");
    }
    public final void type(){
        System.out.println("Vehicle type: Car");
    }
}
class Car extends Vehicles{
    public Car(){
        super();
        System.out.println("It is Parent Child Class Constructor.");
    }
}
public class consst {
    public static void main(String[] args) {
        Car c=new Car();
        c.type();
    }
}



