package Homeworks.lesson6;

public class StarPyramid {
    public static void pyramidCreator() {
        System.out.println("Let's create a pyramid out of stars!");
        String[][] stars = new String[5][10];

        int steps = 1;
        int position = stars[0].length / 2;
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                stars[i][stars[0].length / 2] = "*";
            }
            for (int j = i; j <= steps; j++) {
                stars[i][position - 1] = "*";
                stars[i][position] = " ";
            }
            position--;
            steps += 2;
            System.out.println(stars[i][steps]);
        }

    }


    public static void main(String[] args) {
        pyramidCreator();
    }
}
