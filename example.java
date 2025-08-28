public class example<T> {
    public T name;
    public T age;

    void Box(T name, T age) {
        this.name = name;
        this.age = age;
    }
    void out(){
        System.out.println(name + " " + age);
    }

public static void main(String[] args) {
    example<String> s = new example<>();
    s.Box("Bibek Kandel", "20");
    s.out();
}
}