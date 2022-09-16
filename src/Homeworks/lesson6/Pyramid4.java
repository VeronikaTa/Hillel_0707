package Homeworks.lesson6;

public class Pyramid4 {
    public static void pyramid4() {
        System.out.println("Let's create a pyramid out of stars!");

        String[][] starsArray = new String[5][10];
        int steps = 1;
        int startingPoint = starsArray.length / 2;
        int indexColumn = 0;
        for (int i = 0; i <= 4; i++) {
            for (int k = 0; k < steps; k++) {
                starsArray[i][startingPoint + indexColumn] = " *";
                System.out.print(starsArray[i][startingPoint + indexColumn]);
                if (k < 5) {
                    indexColumn++;
                }
            }
            System.out.println();
            if (i != 4) {
                steps++;
            }
        }
    }

    public static void main(String[] args) {
        pyramid4();
    }
}
