package org.java8.thread.create;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeet,
 * Date:    04/08/24,
 * Time:    3:27 pm
 */
public class MultipleThreadByExtendThread extends Thread {

    public void run() {
        System.out.println(Thread.currentThread().getName() + " started");
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MultipleThreadByExtendThread().start();
        }
    }
}