
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileOperations {
    private static final String FILENAME = "nextintech.txt";
    public static void main(String[] args) {
        try {
            System.out.println("Creating and writing to file...");
            try (FileWriter writer = new FileWriter(FILENAME)) {
                writer.write("Initial Content");
            }
            System.out.println("Reading initial content...");
            try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
                System.out.println(reader.readLine());
            }
            System.out.println("Appending to file...");
            try (FileWriter writer = new FileWriter(FILENAME, true)) {
                writer.write(" - Updated Content");
            }
            System.out.println("Reading updated content...");
            try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
                System.out.println(reader.readLine());
            }
            System.out.println("Deleting file...");
            Files.deleteIfExists(Paths.get(FILENAME));
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("An IOException occurred: " + e.getMessage());
        }}}
