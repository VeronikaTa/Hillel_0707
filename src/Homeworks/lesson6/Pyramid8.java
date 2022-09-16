package Homeworks.lesson6;

import java.util.Arrays;

public class Pyramid8 {
    public static String[][] pyramidCreate() {
        System.out.println("Let's create a pyramid out of stars!");

        String[][] starsArray = new String[5][10];

        int colIter = 5;
        int start = 0;
        for (int rows = 0; rows <= 4; rows++) {
            if (rows == 4) {
                starsArray[4][(starsArray[rows].length / 2) - 1] = "*";
            } else {
                int indexCol = start + 1;

                for (int col = 0; col < colIter; col++) {
                    if (col == 0) {
                        starsArray[rows][start] = "*";
                    } else {
                        starsArray[rows][indexCol] = " ";
                        starsArray[rows][++indexCol] = "*";
                        indexCol++;
                    }
                }
                start++;
                colIter--;
            }
        }

        return starsArray;

    }

    public static void pyramidToConsole(String[][] starsArray) {
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 10; j++) {
                if (starsArray[i][j] == null) {
                    System.out.print(' ');
                } else {
                    System.out.print(starsArray[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramidToConsole(pyramidCreate());
    }
}