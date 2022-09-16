package Lessons.lesson6;

public class Lesson6 {
    public static void main(String[] args) {
        String text = "Hello I am Maks";

        if (text.equalsIgnoreCase("I am MAKS")) {
            System.out.println("Ok");
        } else {
            System.out.println("Fail");
        }

        String text2 = "Hello I am Alex";
        System.out.println(text2.indexOf("l"));
        System.out.println(text2.lastIndexOf("l"));


        int num = 123;
        String text3 = String.valueOf(num);
        System.out.println(text3);

        String numbs = "1237";
        int temp4 = Integer.parseInt(numbs);
        System.out.println(temp4);

        double myNumber = 128.907;
        System.out.println(Math.round(myNumber));
        System.out.println(Math.floor(myNumber));
        System.out.println(Math.ceil(myNumber));

        String[] arr = {"Hello", "my", "name", "is", "Maks"};

        reverseArr(arr);

        for (String str : arr) {
            System.out.print(str + " ");
        }
    }

    public static void reverseArr(String[] arr) {
        int lengthArr = arr.length;

        String temp;

        for (int i = 0; i < lengthArr / 2; i++) {
            temp = arr[lengthArr - i - 1];
            arr[lengthArr - i - 1] = arr[i];
            arr[i] = temp;
        }
    }
}

