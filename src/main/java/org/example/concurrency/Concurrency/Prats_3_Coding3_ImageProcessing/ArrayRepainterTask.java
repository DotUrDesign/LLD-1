package org.example.concurrency.Concurrency.Prats_3_Coding3_ImageProcessing;

import java.util.concurrent.Callable;

public class ArrayRepainterTask implements Callable<Void> {
    private int[][] arr;
    private int startRow;
    private int endRow;
    private int startCol;
    private int endCol;
    public ArrayRepainterTask(int[][] arr, int startRow, int endRow, int startCol, int endCol) {
        this.arr = arr;
        this.startRow = startRow;
        this.endRow = endRow;
        this.startCol = startCol;
        this.endCol = endCol;
    }

    @Override
    public Void call() throws Exception {
        for(int i=startRow;i<=endRow;i++) {
            for(int j=startCol;j<=endCol;j++) {
                arr[i][j] = arr[i][j] * 2;
                System.out.print(arr[i][j] + " :::: " + Thread.currentThread().getName() + "   ,   ");
            }
            System.out.println();
        }
        return null;
    }
}
