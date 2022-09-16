package Lessons.lists;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListEx {
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        LinkedList<String> myLinkedList = new LinkedList<>();
        myLinkedList.add("String");
        myArrayList.add("string");


        myLinkedList.add("Ron");
        myLinkedList.add("Harry");
        System.out.println("The 0th element in the linked list was " + myLinkedList.get(0));
        myLinkedList.remove(0);
        System.out.println("The 0th element in the linked list is " + myLinkedList.get(0));
    }
}
