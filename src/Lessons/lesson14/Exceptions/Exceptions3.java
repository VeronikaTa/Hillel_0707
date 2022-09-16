package Lessons.lesson14.Exceptions;

import java.io.FileWriter;
import java.io.IOException;

class Exceptions3 {

    public static void main(String[] args) {
        String address = "file3.txt";
        String input = "Input";
        writeTOFile(address, input);

        System.out.println("Let's continue");
    }

    static void writeTOFile(String address, String input) {
        try {
            FileWriter fileWriter3 = new FileWriter(address);
            fileWriter3.close();
            fileWriter3.write(input);
        } catch (IOException e) {
            System.out.println("The stream is closed. It is impossible to write to file!");
        }
    }

}
