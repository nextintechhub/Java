

class Animals{
    public void sounds(){
        System.out.println("It is Animal Life!");
    }
}
class Dogs extends Animals{
    public void sounds(){
        System.out.println("Dog is Bark!!!!");
    }
}
public class dyana {
    public static void main(String[] args) {
        Animals a = new Dogs();
        a.sounds();
    }
}





