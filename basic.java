public class basic {

    String name = "Bibek Kandel";
    int age = 20;
    String address = "Chitwan, Nepal";

    public static void main(String[] args) {
        basic clas = new basic();
        // System.out.println("Name: " + clas.name);
        // System.out.println("Age: " + clas.age);
        // System.out.println("Address: " + clas.address);
        clas.visit(); // method calling
    }
    int visit() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        return 0;
    }

}
