
class card{
    public void start(){
        System.out.println("It is car Showroom!!");
    }
}
class bus extends card{
    public void start(){
        System.out.println("SUV Start!!!!");
    }
}
class BYD extends card{
    public void start(){
        System.out.println("BYD Start!!!!");
    }
}
public class multilvl {
    public static void main(String[] args) {
        bus b=new bus();
        b.start();
        BYD B=new BYD();
        B.start();
    }
}



