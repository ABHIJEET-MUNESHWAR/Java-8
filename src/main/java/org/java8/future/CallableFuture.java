package org.java8.future;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeet,
 * Date:    04/08/24,
 * Time:    7:12 pm
 * <a href="https://youtu.be/ImtZgX1nmr8?si=jIYeAZdAX4W_oIZS">Introduction to CompletableFuture in Java 8</a>
 */
public class CallableFuture {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> future = executorService.submit(new Task());
        /*CompletableFuture.supplyAsync(()->getOrder())
            .thenApply(order->enrichOrder(order))
            .exceptionally(e-> FailedOrder())
            .thenAccept((process)->processOrder(process));*/
        try {
            Integer result = future.get();
            System.out.println("result: " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}

class Task implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return new Random().nextInt();
    }
}