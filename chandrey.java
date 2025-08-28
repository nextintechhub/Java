abstract class chandrey {
void my(){
    System.out.println("This is Concrete Method");
}
public abstract void method();
}
class lool extends chandrey{
    public void method() {
        System.out.println("This is Abstract Method");
    }
}
class dhop{
    public static void main(String[] args) {
        lool l = new lool();
        l.my();
        l.method();
    }
}
