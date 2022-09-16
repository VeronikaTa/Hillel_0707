package Homeworks.lesson5;

public class Stars {
    public static void main(String[] args) {
        char[][] stars = new char[3][5];

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                stars[i][j] = '*';
            }
        }

        for (int i = 0; i < stars.length; i++) {
            for (int j = 0; j < stars[i].length; j++) {
                System.out.print(stars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
