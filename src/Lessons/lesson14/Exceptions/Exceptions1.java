package Lessons.lesson14.Exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class Exceptions1 {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter1 = new FileWriter("file1.txt");
        fileWriter1.close();
        fileWriter1.write("Hello");
    }
}
