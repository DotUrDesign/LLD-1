package org.example.java.Java.Prats_3_Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue_Impl {
        public static void main(String[] args) {
// Creating a PriorityQueue with Integer elements
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
// Adding elements to the PriorityQueue
            priorityQueue.offer(30);
            priorityQueue.offer(10);
            priorityQueue.offer(20);
// Using Iterator to iterate over elements in PriorityQueue
            System.out.println("Elements in PriorityQueue using Iterator:");
            Iterator<Integer> iterator = priorityQueue.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        }
}
