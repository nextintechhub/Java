
class operator{
    int c;
    void dis(){
        c = 6*7+8/2;
        //6*7+4
        //42+4
        //46
        System.out.println(c);
    }

    public static void main(String[] args) {
        operator o = new operator();
        o.dis();
    }
}