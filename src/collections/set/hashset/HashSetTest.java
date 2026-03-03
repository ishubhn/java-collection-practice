package collections.set.hashset;

import collections.util.PrintUtil;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class HashSetTest {
    public static void main(String[] args) {
        // 1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> set = new HashSet<>();
        set.add("Peter");
        set.add("Tony");
        set.add("Robert");

        System.out.println("set: " + set);

        // 2. Write a Java program to iterate through all elements in a hash list.
        PrintUtil.printLineSeparator();
        // i. iterator
        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println();
        // ii. foreach enhanced loop
        for (String word: set) {
            System.out.println(word);
        }

        PrintUtil.printLineSeparator();

        // 3. Write a Java program to get the number of elements in a hash set.
        System.out.println("Size of set: " + set.size());

        // 4. Write a Java program to empty a hash set.
        set.clear();

        // 5. Write a Java program to test if a hash set is empty or not.
        System.out.println(set.isEmpty() ? "Set is empty" : "Set is not empty");
        PrintUtil.printLineSeparator();

        // 6. Write a Java program to clone a hash set to another hash set.
        set.add("Peter");
        set.add("Tony");
        set.add("Robert");

        HashSet<String> copySet = (HashSet<String>) set.clone();

        // 7. Write a Java program to convert a hash set to an array.
        String[] arr = new String[copySet.size()];
        copySet.toArray(arr);

        // 8. Write a Java program to convert a hash set to a tree set.
        TreeSet<String> treeSet = new TreeSet<>(copySet);
        System.out.println("Tree set: " + treeSet);

        // 11. Write a Java program to compare two sets and retain elements that are the same.
        System.out.println("Common elements: " + copySet.retainAll(set));

        // 12. Write a Java program to remove all elements from a hash set.
        copySet.clear();
    }
}
