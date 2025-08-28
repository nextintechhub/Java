

interface Moveable{
    void move();
}
class carrrrr implements Moveable{
    public void move(){
        System.out.println("Car is going to start !");
    }
}
public class inter {
    public static void main(String[] args) {
        carrrrr cr=new carrrrr();
        cr.move();
    }
}




