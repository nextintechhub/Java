
public class inn {
    public void dis(){
        System.out.println("I am a Outer Calss!!");
    }
    class inner {
        public void show(){
            System.out.println("I Am Inner Class!");
        }
    }
    public static void main(String[] args) {
        inn out=new inn();
        inn.inner obj=out.new inner();
        obj.show();
        out.dis();
    }
}
