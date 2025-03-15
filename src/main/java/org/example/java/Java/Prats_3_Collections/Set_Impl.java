package org.example.java.Java.Prats_3_Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Impl {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("P1");
        mySet.add("P2");
        mySet.add("P2");
        mySet.add("P3");

        System.out.println(mySet);
    }
}
