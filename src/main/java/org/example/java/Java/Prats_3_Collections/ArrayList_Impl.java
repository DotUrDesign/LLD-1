package org.example.java.Java.Prats_3_Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_Impl {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        // adding elements into a list
        myList.add("P1");
        myList.add("P2");
        myList.add("P3");
        System.out.println("Elements : " + myList);

        // iterating over the elements using an iterator
        Iterator<String> iterator = myList.iterator();
        while(iterator.hasNext()) {
            String ele = iterator.next();
            if(ele.equals("P2")){
                iterator.remove();
            }
            System.out.print(ele + " ");
        }
        System.out.println();
        System.out.println("Updated list : " + myList);
    }
}
