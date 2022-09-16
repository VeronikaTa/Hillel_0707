package Lessons.lesson14.Exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Exceptions4 {

    public static void main(String[] args) {
        String address = "file4.txt";
        String input = "Input";
        writeToFile(address, input);
        System.out.println("Let's continue");
    }

    static void writeToFile(String address, String input) {

        try {
            FileWriter fileWriter4 = new FileWriter(address);
            fileWriter4.close();
            fileWriter4.write(input);
        } catch (IOException e) {
            System.out.println("The stream is closed. It is impossible to write to file");
        } finally {
            System.out.println("Finally: This will be displayed under any circumstances");
        }
    }
}
