import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {

        /*
        // The File class is used to create an object that represents a file or directory in the file system.
        File file = new File("example.txt");
        try {
            file.createNewFile();
        }
        catch (Exception e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
            e.getStackTrace();
        }


        // The FileWriter class is used to write character data to a file.
        // It provides methods for writing characters, strings, and arrays of characters to a file.
        try {
            FileWriter writer = new FileWriter("example.txt");
            writer.write("Hello, this is a sample text written to the file.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // The Scanner class is used to read input from various sources, including files.
        // It provides methods for reading different types of data, such as strings, integers, and floating-point numbers, from a file.
        File readFile = new File("example.txt");
        try {
            Scanner sc = new Scanner(readFile);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        // The delete() method of the File class is used to delete a file or directory from the file system.
        File file = new File("example.txt");
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
        */


        // The exists() method of the File class is used to check if a file or directory exists in the file system.
        File checkFile = new File("example.txt");
        if(checkFile.exists())
        {
            System.out.println("File exists.");
        }
        else
        {
            System.out.println("File does not exist.");
        }
    }
}