
abstract class shape{
    abstract public void draw();
}
class Rectangle extends shape{
    public void draw(){
        System.out.println("This is a Rectangle.");
    }
}
public class Shaped {
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.draw();
    }
}




