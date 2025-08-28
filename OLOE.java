class Animal{
    void sound(){
        System.out.println("Animal Voice is olelelele");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog says vauvau");
    }
}
class calc{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class OLOE {
    public static void main(String[] args) {
        Animal my = new Animal();
        Animal mi = new Dog();

        my.sound();
        mi.sound();

        calc c = new calc();
        System.out.println("Sum of: " + c.add(2,3));
        System.out.println("Sum of: " + c.add(1,3,7));
        System.out.println("Sum of: " + c.add(2.5,7.5));
    }
}
