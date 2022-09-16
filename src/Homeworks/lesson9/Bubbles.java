package Homeworks.lesson9;

public class Bubbles {
    public static int[] bubbleSort(int[] array) {
        int arrayLength = array.length;
        int temp;
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] < array[i + 1]) {
                    sorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    public static void display(int[] array) {
        for (int temp : array) {
            System.out.print(temp + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {11, 3, 1, 14, 7};
        int[] arraySorted = bubbleSort(array);
        display(arraySorted);
    }
}
