package Hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class CompareHashmap {
    public static void main(String[] args) {

        // New HashMap1
        HashMap<Integer, String> map1 = new HashMap<>();

        // Add Entry to map
        map1.put(1, "Akshay");
        map1.put(2, "Bina");
        map1.put(3, "Chintu");

        // New HashMap2
        HashMap<Integer, String> map2 = new HashMap<>();

        // Add Entry to map
        map2.put(3, "Chintu");
        map2.put(2, "Bina");
        map2.put(1, "Akshay");

        HashMap<Integer, String> map3 = new HashMap<>();

        // Add Entry to map
        map3.put(1, "Akshay");
        map3.put(2, "Binod");
        map3.put(3, "Chintu");

        System.out.println("map1 == map2 : "
                + map1.equals(map2));
        System.out.println("map1 == map3 : "
                + map1.equals(map3));


        // Compare map1 and map2 keys using keySet() and
        // equals() method
        System.out.println(
                "map1 keys == map2 keys : "
                        + map1.keySet().equals(map2.keySet()));
        HashSet<String> set1 = new HashSet<>(map1.values());

        // Value set of map2
        HashSet<String> set2 = new HashSet<>(map2.values());

        // Value set of map3
        HashSet<String> set3 = new HashSet<>(map3.values());

        // Compare map1 and map2 values using equals()
        // method
        System.out.println("map1 values == map2 values : "
                + set1.equals(set2));
    }
}
