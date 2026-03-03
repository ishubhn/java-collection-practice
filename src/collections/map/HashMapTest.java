package collections.map;

import collections.util.PrintUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        // 1. Write a Java program to associate the specified value with the specified key in a HashMap.
        map.put(1, "Red");
        map.put(2, "Blue");
        map.put(3, "Yellow");

        // 2. Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("Size of map: " + map.size());

        // 3. Write a Java program to copy all mappings from the specified map to another map.
        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(2, "Light Blue");
        map2.put(4, "Green");
        map2.put(5, "Violet");

        map2.putAll(map);
        System.out.println("Merged map: " + map2);

        // 4. Write a Java program to remove all mappings from a map.
        map.clear();

        // 5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println(map.isEmpty() ? "Map is empty" : "Map is not empty");
        PrintUtil.printLineSeparator();

        // 6. Write a Java program to get a shallow copy of a HashMap instance.
        HashMap<Integer, String> m2 = (HashMap<Integer, String>) map2.clone();

        // 7.Write a Java program to test if a map contains a mapping for the specified key.
        System.out.println("Does key 2 exist: " + m2.containsKey(2));

        // 8. Write a Java program to test if a map contains a mapping for the specified value.
        System.out.println("Does value Blue exist: " + m2.containsValue("Purple"));

        PrintUtil.printLineSeparator();

        // 9. Write a Java program to create a set view of the mappings contained in a map.
        // 11. Write a Java program to get a set view of the keys contained in this map.
        Set<Map.Entry<Integer, String>> set = m2.entrySet();
        System.out.println("Set: " + set);

        // 10. Write a Java program to get the value of a specified key in a map.
        System.out.println("value at key: 2:  " + m2.get(2));
        PrintUtil.printLineSeparator();

        // 12. Write a Java program to get a collection view of the values contained in this map.
        System.out.println(m2);
    }
}
