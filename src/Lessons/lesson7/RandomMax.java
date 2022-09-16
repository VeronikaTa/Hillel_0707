package Lessons.lesson7;

public class RandomMax {
    public static void randomMax() {

        int max = 0;
        int[] array = new int[8];

        for (int i = 0; i < 8; i++) {
            array[i] = (int) (Math.random() * 100);

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        randomMax();
    }
}
