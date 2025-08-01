import java.io.*;

public class FileHandlingExample {
    public static void main(String[] args) {
        String filename = "example.txt";

        // Write to a file
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write("Hello, this is a line written to the file.\n");
            writer.write("This is the second line.");
            System.out.println("File written successfully.");
        } catch (IOException e) {
