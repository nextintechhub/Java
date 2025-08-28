import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class except {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fileName = "NextInTech.txt";
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===File Operations Menu===");
            System.out.println("1. Create and Write an Initial Content");
            System.out.println("2. Read the File Content");
            System.out.println("3. Append and Update Content");
            System.out.println("4. Delete File");
            System.out.println("5. Exit");
            System.out.println("Enter Your Choice: ");

            int Choice = sc.nextInt();
            sc.nextLine();

            switch (Choice) {

                case 1:
                    try (FileWriter writer = new FileWriter(fileName)) {
                        writer.write(
                                "Next Innovation Technology is the youth-lead company founded by the students in 2025. The Main thing in this office is to give the opportinuties to the students to learn and grow.");
                        System.out.println("File Created and Content Written Successfully");
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("\n Reading File Content: ");
                    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try (FileWriter writer = new FileWriter(fileName, true)) {
                        writer.write(
                                " In this company we provide the best quality products and services to our customers.");
                        System.out.println("Content Appended and Updated Successfully");
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        Files.deleteIfExists(Paths.get(fileName));
                        System.out.println("File Deleted Successfully");
                    } catch (IOException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting the Program.....");
                    System.out.println("Exited Successfully !!");
                    break;
            }
        }
        sc.close();
    }
}
