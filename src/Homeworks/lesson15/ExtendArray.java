package Homeworks.lesson15;

public class ExtendArray {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6};
        for (int number : array1) {
            System.out.print(number + " ");
        }

        System.out.println();

        int[] array2 = extendArray(array1, 7);

        for (int number : array2) {
            System.out.print(number + " ");
        }

    }

    public static int[] extendArray(int[] arrayToExtend, int numberToAdd) {
        int previousLength = arrayToExtend.length;

        int[] extendedArray = new int[previousLength + 1];
        int newLength = extendedArray.length;

        for (int i = 0; i < newLength; i++) {
            if (i == (newLength - 1)) {
                extendedArray[i] = numberToAdd;
            } else {
                extendedArray[i] = arrayToExtend[i];
            }

            extendedArray[i] =  i == 4 ? numberToAdd : arrayToExtend[i];
        }

        return extendedArray;
    }
}
