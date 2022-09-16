package Lessons.lists;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("Rob");
        myArrayList.add("Helen");
        myArrayList.add("Thomas");
        String name = myArrayList.get(0);
        System.out.println(name);

        System.out.println(myArrayList.indexOf("Helen"));
        myArrayList.set(0, "Mark");
        System.out.println(myArrayList.get(0));

        myArrayList.remove(0);
        System.out.println(myArrayList.get(0));
    }
}
