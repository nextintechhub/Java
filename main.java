 class inhritence {
      protected int a=10;
    void  mymethod(){
        System.out.println(a);
    }

}
class  mult extends inhritence{
    void mu() {
        System.out.println();
    }
}
class  subclass extends  inhritence{
void submethod(){
    System.out.println(a);
    System.out.println("This is a subcalass ");
}
}
class main{
    public static void main(String[] args) {
        subclass sc = new subclass();
        sc.mymethod();
        sc.submethod();
    }
}