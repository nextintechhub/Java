public class Con {
    int a = 10;
    int b = 20;

    Con() {
        System.out.println("This is default constructure");
    }

    Con(int a, int b) {
        this.a = a;
        this.b = b;
    }

    Con(Con d) {
        this.a = d.a;
        this.b = d.b;
    }

    void dis(){
        System.out.println(a+b);
    }

    public static void main(String[] args) {
        Con c = new Con();
        Con cc = new Con(2,3);
        Con ccc = new Con(cc);
        cc.dis();
        ccc.dis();
    }
}
