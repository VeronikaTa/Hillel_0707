package Lessons.lesson12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {

    public static void writeToFile(String fileName) {
        try {
            FileWriter myFileWriter = new FileWriter(fileName);
            myFileWriter.write("One, two, buckle my shoe");
            myFileWriter.write("\nThree, four, knock at the door");
            myFileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
            Scanner myScanner = new Scanner(fileReader);

            while (myScanner.hasNextLine()) {
                System.out.println(myScanner.nextLine());
                System.out.println();
            }
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Exception: " + e);
        }

    }

    public static void main(String[] args) {
        String name = "file_new.txt";
        writeToFile(name);
        readFile(name);
    }
}
