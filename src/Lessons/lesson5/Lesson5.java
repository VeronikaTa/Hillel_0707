package Lessons.lesson5;

import java.util.Arrays;

public class Lesson5 {
    public static void main(String[] args) {

        int[][] twoDimArray = new int[3][4];

        twoDimArray[0][0] = 5;
        twoDimArray[0][1] = 4;
        twoDimArray[0][2] = 4;
        twoDimArray[0][3] = 4;
        twoDimArray[1][0] = 3;
        twoDimArray[1][1] = 2;
        twoDimArray[1][2] = 0;
        twoDimArray[1][3] = 5;
        twoDimArray[2][0] = 9;
        twoDimArray[2][1] = 3;
        twoDimArray[2][2] = 4;
        twoDimArray[2][3] = 5;

        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                System.out.print(twoDimArray[i][j] + " ");
            }
            System.out.println();
        }

        int[][] twoDimArray2 = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        for (int i = 0; i < twoDimArray2.length; i++) {
            for (int j = 0; j < twoDimArray2[i].length; j++) {
                System.out.print(twoDimArray2[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(twoDimArray2));
    }

}
