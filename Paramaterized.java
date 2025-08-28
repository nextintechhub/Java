class Overriding {
    void mi(String name){
        System.out.println(name);
    }

}
public class Paramaterized extends Overriding{

    void mi(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Paramaterized my = new Paramaterized();


        my.mi("Bibek");
    }
}
