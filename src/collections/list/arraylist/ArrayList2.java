package collections.list.arraylist;

import collections.util.PrintUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        // 16. Write a Java program to clone an array list to another array list.
        ArrayList<Integer> li2 = new ArrayList<>(list);
        System.out.println("The new list: " + li2);
        PrintUtil.printLineSeparator();

        // 17. Write a Java program to empty an array list.
        li2.clear();
        System.out.println("after emptying the list: " + li2);

        // 18. Write a Java program to test whether an array list is empty or not.
        li2.add(1);
        li2.add(41);
        li2.add(13);
        String msg = li2.isEmpty() ? "List 2 is empty" : "List 2 is not empty";
        System.out.println(msg);

        // 19. Write a Java program for trimming the capacity of an array list.
        li2.trimToSize();

        // 20. Write a Java program to increase an array list size.
        li2.ensureCapacity(6);
        PrintUtil.printLineSeparator();

        // 21. Write a Java program to replace the second element of an ArrayList with the specified element.
        System.out.println(li2);
        li2.set(1, 12);
        PrintUtil.printLineSeparator();

        // 22. Write a Java program to print all the elements of an ArrayList using the elements' position.
        for (int i = 0; i < li2.size(); i++) {
            System.out.printf("The element at index: '%d' and value: '%d'%n", i, li2.get(i));
        }
    }
}
