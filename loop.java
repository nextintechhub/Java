abstract  class  dhoop{

    abstract  void sangam();
    void regular(){
        System.out.println("regular");
    }


}
class  loop extends  dhoop{
    void sangam()
    {
        System.out.println("print ");
    }
    public static void main(String[] args) {
        loop l = new loop();
    l.sangam();
    l.regular();
    }
}