
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
class FileReaderTask {
    public void readFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }}}
    public static void main(String[] args) {
        FileReaderTask fileReader = new FileReaderTask();
        try {
            fileReader.readFile("nonexistent_file.txt");
        } catch (IOException e) {
            System.out.println("An IOException occurred while reading the file: " + e.getMessage());
        }}}
