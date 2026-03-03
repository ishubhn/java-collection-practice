package collections.list.linkedlist;

import collections.util.PrintUtil;

import java.util.*;
import java.util.stream.Stream;

public class LinkedList2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Test");
        list.add("Light");
        list.add("Spider-man");

        // 15. Write a Java program that swaps two elements in a linked list.
        Collections.swap(list, 1, 2);

        // 16. Write a Java program to shuffle elements in a linked list.
        Collections.shuffle(list);

        // 17. Write a Java program to join two linked lists.
        LinkedList<String> list2 = new LinkedList<>(Arrays.asList("Superman", "IronMan"));

        List<String> newList = Stream.concat(list.stream(), list2.stream()).toList();
        System.out.println("Merged list: " + newList);

        // 18. Write a Java program to copy a linked list to another linked list.
        LinkedList<String> copyList = (LinkedList<String>) list2.clone();

        // 19. Write a Java program to remove and return the first element of a linked list.
        System.out.println("Removed item at index 0 -> " + copyList.removeFirst());
        PrintUtil.printLineSeparator();

        // 20. Write a Java program to retrieve, but not remove, the first element of a linked list.
        System.out.println("Get item at index 0 -> " + copyList.getFirst());

        // 21. Write a Java program to retrieve, but not remove, the last element of a linked list.
        System.out.println("Get item at index last -> " + copyList.getLast());
        System.out.println("Copy List: " + copyList);
        PrintUtil.printLineSeparator();

        // 22. Write a Java program to check if a particular element exists in a linked list.
        LinkedList<String> newList1 = new LinkedList<>(Arrays.asList("Spider-man", "Superman", "IronMan", "Batman"));

        if (newList1.contains("Batman"))
            System.out.println("Batman exist");
        else
            System.out.println("Batman don't exist");

        PrintUtil.printLineSeparator();

        // 23. Write a Java program to convert a linked list to an array list.
        ArrayList<String> arrL = new ArrayList<>(newList1);

        // 24. Write a Java program to compare two linked lists.

        // 25. Write a Java program to check if a linked list is empty or not.
        System.out.println("List: " + copyList);
        copyList.clear();

        // 26. Write a Java program to replace an element in a linked list.
        newList1.set(2, "IronGirl");
        System.out.println("New list: " + newList1);
    }
}
