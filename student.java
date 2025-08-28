public class student {

    String name = "Bibek Kandel";
    int age = 19;
    String address = "Chitwan, Nepal";

    public static void main(String[] args) {
        student pandey = new student();
        pandey.display();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);

    }
}