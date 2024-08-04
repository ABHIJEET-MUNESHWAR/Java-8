package org.java8.completablefuture;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeet,
 * Date:    04/08/24,
 * Time:    5:05 pm
 */
public class CompletableFutureTest {
    public static void main(String[] args) {
        CompletableFutureTest futureTest = new CompletableFutureTest();
        CompletableFuture<String> stringCompletableFuture = futureTest.calculateAsync();
        try {
            String result = stringCompletableFuture.get();
            System.out.println(result);
            System.out.println(Thread.currentThread().getName());
            System.out.println("------------------------------");
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }

    private CompletableFuture<String> calculateAsync() {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();
        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        Executors.newCachedThreadPool().submit(() -> {
            try {
                Thread.sleep(5);
                String joinString = String.join(",", list);
                System.out.println(Thread.currentThread().getName());
                completableFuture.complete(joinString);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        });
        return completableFuture;
    }
}