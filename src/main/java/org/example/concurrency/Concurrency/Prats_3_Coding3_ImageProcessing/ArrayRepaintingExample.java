package org.example.concurrency.Concurrency.Prats_3_Coding3_ImageProcessing;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


/*

    CODING PROBLEM 3 : IMAGE PROCESSING

    Many image processing applications like Lightroom & Photoshop use multiple threads to
process an image quickly. In this problem, you will build a simplified image
repainting task using multiple threads, the repainting task here simply doubles the
value of every pixel stored in the form of a 2D array. Take Input a NXN matrix and
repaint it by using 4 threads, one for each quadrant.
Solution Repainting a 2D array using four threads can be achieved by dividing the
array into quadrants, and assigning each quadrant to a separate thread for repainting.
This example divides the 2D array into four quadrants and assigns each quadrant to a
separate thread for repainting. The ArrayRepainterTask class represents the task for
repainting a specific quadrant. The program then uses an ExecutorService with a fixed
thread pool to concurrently execute the tasks. Finally, it prints the repainted 2D
array.

 */

public class ArrayRepaintingExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        int[][] originalArray = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int rows = originalArray.length;
        int cols = originalArray[0].length;

        int midRow = rows/2;
        int midCol = cols/2;

        ArrayRepainterTask task1 = new ArrayRepainterTask(originalArray, 0, midRow-1, 0, midCol-1);
        ArrayRepainterTask task2 = new ArrayRepainterTask(originalArray, midRow, rows-1, 0, midCol-1);
        ArrayRepainterTask task3 = new ArrayRepainterTask(originalArray, 0, midRow-1, midCol, cols-1);
        ArrayRepainterTask task4 = new ArrayRepainterTask(originalArray, midRow, rows-1, midCol, cols-1);

        ExecutorService executor = Executors.newFixedThreadPool(4);
        Future<Void> f1 = executor.submit(task1);
        Future<Void> f2 = executor.submit(task2);
        Future<Void> f3 = executor.submit(task3);
        Future<Void> f4 = executor.submit(task4);

        f1.get();
        f2.get();
        f3.get();
        f4.get();
        executor.shutdown();

        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.print(originalArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
