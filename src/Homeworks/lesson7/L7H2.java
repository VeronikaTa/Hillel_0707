package Homeworks.lesson7;

public class L7H2 {

    public static void main(String[] args) {
        int[] intArray = getArray();
        int arithmeticMean = getArithmeticMean(intArray);
        typeToConsole(arithmeticMean);
    }

    public static int[] getArray() {
        int[] intArray = new int[10];

        int arrayLength = intArray.length;
        for (int i = 0; i < arrayLength; i++) {
            intArray[i] = (int) (Math.random() * 11 + 10);
        }
        return intArray;
    }

    public static int getArithmeticMean(int[] intArray) {
        int sum = 0;
        for (int number : intArray) {
            sum += number;
        }
        return sum / intArray.length;
    }

    public static void typeToConsole(int arithmeticMean) {
        System.out.println("The arithmetic mean is: " + arithmeticMean);
    }
}
