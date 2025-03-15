package org.example.java.Java.Prats_3_Collections;

import java.util.HashMap;
import java.util.Map;

public class Map_Impl {
    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Java", 1);
        myMap.put("Kotlin", 2);
        myMap.put("C++", 3);
        myMap.put("Kotlin", 5);

        System.out.println("Map elements : " + myMap);
    }
}
