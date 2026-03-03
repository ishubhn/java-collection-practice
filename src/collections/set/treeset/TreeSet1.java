package collections.set.treeset;

import java.util.Collections;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        // 1. Write a Java program to create a tree set, add some colors (strings) and print out the tree set.
        TreeSet<String> set = new TreeSet<>();
        set.add("Violet");
        set.add("Indigo");
        set.add("Blue");
        System.out.println("Colors 1: " + set);

        // 2. Write a Java program to add all the elements of a specified tree set to another tree set.
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("Green");
        set1.addAll(set);
        System.out.println("All set: " + set1);

        // 3. Write a Java program to create a reverse order view of the elements contained in a given tree set.+
        Iterator<String> it = set1.descendingIterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
