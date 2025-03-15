package org.example.java.Java.Prats_3_Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap_with_CustomObjects_Impl {
    public static void main(String[] args) {
        Map<Person, String> myMap = new HashMap<>();
        Person person1 = new Person(1,"A", 24);
        Person person2 = new Person(2, "B", 24);
        myMap.put(person1, "P1");
        myMap.put(person2, "P2");

        Person person3 = new Person(1, "A", 24);
        String position = myMap.get(person3);

        System.out.println("Position for : " + person3 + " : " + position);
    }
}
