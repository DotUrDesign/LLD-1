package org.example.concurrency.Concurrency.Prats_4_Coding4_CalculateBinaryTreeSize;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class TreeSizeCalculator implements Callable<Integer> {
    private Node root;
    private ExecutorService executor;

    public TreeSizeCalculator(Node root, ExecutorService executor) {
        this.root = root;
        this.executor = executor;
    }

    @Override
    public Integer call() throws Exception {
        if(root == null)
            return 0;

        TreeSizeCalculator left = new TreeSizeCalculator(root.left, executor);
        TreeSizeCalculator right = new TreeSizeCalculator(root.right, executor);

        Future<Integer> futureLeft = executor.submit(left);
        Future<Integer> futureRight = executor.submit(right);

        Integer leftSize = futureLeft.get();
        Integer rightSize = futureRight.get();

        return 1 + leftSize + rightSize;
    }
}
