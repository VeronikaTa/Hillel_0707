package Homeworks.lesson6;

public class Pyramid3 {
    public static String[] pyramid3(String[] starsArray) {
        System.out.println("Let's create a pyramid out of stars!");

        int steps = 5;
        int blank = 1;
        
        for (int i = 0; i < 5; i++) {
            String stars = " ";
            String blankSpace = " ";
            for (int j = 0; j <= blank; j++) {
                blankSpace = blankSpace.concat(" ");
            }
            for (int k = 0; k < steps; k++) {
                if (k == 0) {
                    stars = "* ";
                } else {
                    stars = stars.concat("* ");
                }
            }
            starsArray[i] = blankSpace.concat(stars);
            steps--;
            blank++;
        }
        return starsArray;
    }

    public static void main(String[] args) {
        String[] starsArr = new String[5];
        pyramid3(starsArr);
        for (int i = 4; i >= 0; i--) {
            System.out.println(starsArr[i]);
        }
    }
}
