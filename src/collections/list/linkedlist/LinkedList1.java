package collections.list.linkedlist;

import collections.util.PrintUtil;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // 1. Write a Java program to append the specified element to the end of a linked list.
        list.add(6);

        // 2. Write a Java program to iterate through all elements in a linked list.
        // i. iterate over loop
        PrintUtil.printLineSeparator();
        System.out.println("Iterate with loop: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i);
        }

        System.out.println("Iterate with enhanced for loop: ");
        for (Integer num: list) {
            System.out.println(num);
        }

        System.out.println("Iterate with stream: ");
        list.forEach(System.out::println);

        // 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
        int givenNum = 1;

        for (int i = givenNum; i < list.size(); i++) {
            System.out.println("index: " + i + ", value: " + list.get(i));
        }
        PrintUtil.printLineSeparator();

        // 4. Write a Java program to iterate a linked list in reverse order.
        Collections.reverse(list);
        System.out.println(list);
        PrintUtil.printLineSeparator();

        // 5. Write a Java program to insert the specified element at the specified position in the linked list.
        // 9. Write a Java program to insert some elements at the specified position into a linked list.
        list.add(2, 10);

        // 6. Write a Java program to insert elements into the linked list at the first and last positions.
        // 7. Write a Java program to insert the specified element at the front of a linked list.
        list.addFirst(0);

        // 8. Write a Java program to insert the specified element at the end of a linked list.
        list.addLast(7);

        // 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        PrintUtil.printLineSeparator();
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        PrintUtil.printLineSeparator();

        // 11. Write a Java program to display elements and their positions in a linked list.
        for (int i = 0; i < list.size(); i++) {
            System.out.println("index: " + i + ", value: " + list.get(i));
        }

        PrintUtil.printLineSeparator();

        // 12. Write a Java program to remove a specified element from a linked list.
        givenNum = 2;

        //        for (int i = givenNum; i < list.size(); i++) {
        //            if (i == givenNum) {
        //                list.remove();
        //            }
        //        }

        int finalGivenNum = givenNum;
        list.removeIf(x -> x == finalGivenNum);

        // 13. Write a Java program to remove the first and last elements from a linked list.
        list.removeFirst();
        list.removeLast();
        System.out.println("Final List: " + list);

        // 14. Write a Java program to remove all elements from a linked list.
        list.clear();
    }
}
