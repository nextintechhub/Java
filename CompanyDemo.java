class Employee {
    private String name;
    private int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
class Manager extends Employee {
    private int teamSize;

    public Manager(String name, int id, int teamSize) {
        super(name, id);
        this.teamSize = teamSize;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Team Size: " + teamSize);
    }
}

public class CompanyDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("Bibek Kandel", 1001);
        Manager mgr = new Manager("Sagar Pandey", 2001, 5);

        System.out.println("=== CEO Details ===");
        emp.displayInfo();

        System.out.println("\n=== Manager Details ===");
        mgr.displayInfo();
    }
}
