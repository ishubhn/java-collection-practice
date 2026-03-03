package collections.list.arraylist;

import collections.util.PrintUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayListTest {
    public static void main(String[] args) {
        // 1. Write a Java program to create an array list, add some colors (strings)
        // and print out the collection.
        List<String> list = new ArrayList<>();
        list.add("Yellow");
        list.add("Red");
        list.add("Blue");
        list.add("Orange");

        System.out.println("\n1. List to array: " + list);
        PrintUtil.printLineSeparator();

        // 2. Write a Java program to iterate through all elements in an array list.
        System.out.println("\n2. Iterate via foreach: ");
        list.forEach(System.out::println);

        System.out.println("\n3. Enhanced loop: ");
        for (String word: list) {
            System.out.println(word);
        }
        PrintUtil.printLineSeparator();

        // 3. Write a Java program to insert an element into the array list at the first position.
        list.add(0, "Violet");

        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
        System.out.println("Element at '3' index: " + list.get(3));

        // 5. Write a Java program to update an array element by the given element.
        list.set(2, "Black");
        System.out.println("updated list: " + list);
        PrintUtil.printLineSeparator();

        // 6. Write a Java program to remove the third element from an array list.
        list.remove(3);
        System.out.println("updated list post removal at index '3': " + list);
        PrintUtil.printLineSeparator();

        // 7. Write a Java program to search for an element in an array list.
        if (list.contains("Yellow")) {
            System.out.println("Color exist");
        } else {
            System.out.println("Color does not exist");
        }

        PrintUtil.printLineSeparator();

        // 8. Write a Java program to sort a given array list.
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // 9. Write a Java program to copy one array list into another.
        //  i. using Collections.copy()
        // To use Collections.copy the size of source and dest list must be same, else throws -> IndexOutOfBoundException
        List<String> newList = new ArrayList<>();
        newList.add("a");
        newList.add("b");
        newList.add("c");
        newList.add("d");

        Collections.copy(newList, list);

        System.out.println("Old list -> " + list);
        System.out.println("New List -> " + newList);

        // ii. Java 10+
        List<String> list2 = List.copyOf(list);
        System.out.println("New List Copy (Java 10+): " + list2);
        PrintUtil.printLineSeparator();

        // 10. Write a Java program to shuffle elements in an array list.
        Collections.shuffle(list);
        System.out.println("list after shuffle : " + list);

        // 11. Write a Java program to reverse elements in an array list.
        Collections.reverse(list);
        System.out.println("list after reverse: " + list);

        PrintUtil.printLineSeparator();

        // 12. Write a Java program to extract a portion of an array list.
        System.out.println("Sub list between index 2-4: " + list.subList(2, 4));
        PrintUtil.printLineSeparator();

        // 13. Write a Java program to compare two array lists.
        System.out.println("Is list same as list2: " + list.equals(list2));
        PrintUtil.printLineSeparator();

        // 14. Write a Java program that swaps two elements in an array list.
        Collections.swap(list, 1, 3);
        System.out.println("List post swapping element 1 with 3: " + list);

        // 15. Write a Java program to join two array lists.
        List<String> newListColors = Arrays.asList("Indigo", "Blue", "Green", "Red");
        // List<String> joinedList = Stream.concat(list.stream(), newListColors.stream()).toList();
        List<String> joinedList = Stream.concat(list.stream(), newListColors.stream()).collect(Collectors.toList());
        System.out.println("Merged list: " + joinedList);
    }
}
