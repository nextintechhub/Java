class mero{
    void game(){
        System.out.println("This is presented by Java Class !!");
    }
}
class tero extends mero{
    @Override
    void game() {
        System.out.println("This is Java Assistant");
    }
}
class Assistant{
    int gname(int a, int b){
        return a+b;
    }
    int gname(int a, int b, int c){
        return a+b+c;
    }
    double gname(double a, double b){
        return a+b;
    }
}
class New {
    public static void main(String[] args) {
        mero x = new mero();
        tero xx = new tero();

        x.game();
        xx.game();

        Assistant naya = new Assistant();
        System.out.println("Game ID: " + naya.gname(2,3));
        System.out.println("Game ID: " + naya.gname(4,5,6));
        System.out.println("Game ID: " + naya.gname(7,8));
    }
}
