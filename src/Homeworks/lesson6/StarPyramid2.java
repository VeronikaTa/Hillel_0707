package Homeworks.lesson6;

public class StarPyramid2 {
    public static void pyramid2() {

        System.out.println("Let's create a pyramid out of stars!");
        String stars = "* ";
        int steps = 5;
        int blank = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= blank; j++) {
                System.out.print(" ");//1) " * * * * * " 2) "  * * * * " 3) "   * * * " 4) "    * * " 5)"     * "
            }
            for (int k = 0; k < steps; k++) {
                System.out.print(stars);
            }
            System.out.println();
            steps--;
            blank++;
        }
    }

    public static void pyramidRightWay() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int x = 0; x < i + 1; x++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid2();
        pyramidRightWay();
    }
}
