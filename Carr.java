
public class Carr {
    private String model;
    private int year;
    public void setYear(int year) {
        this.year = year;
        System.out.println("Year set to: " + year);
    }
    public void setYear(String message, int year) {
        this.year = year;
        System.out.println(message + " " + year);
    }
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
    public void setModel(String model) {
        this.model = model;
    }
    public static void main(String[] args) {
        Carr c = new Carr();
        c.setModel("Toyota Corolla");
        c.setYear(2020);
        c.setYear("Manufactured in", 2025);
        c.displayInfo();
    }
}
