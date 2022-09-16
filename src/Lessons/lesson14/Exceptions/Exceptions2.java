package Lessons.lesson14.Exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Exceptions2 {
    public static void main(String[] args) {
        String address = "file2.txt";
        String input = "Hello there";
        writeToFile(address, input);
        System.out.println("Let's continue");// will be displayed
    }

    public static void writeToFile(String address, String input) {
        try {
            FileWriter fileWriter2 = new FileWriter(address);
            fileWriter2.close();
            fileWriter2.write(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
