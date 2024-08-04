package org.java8.thread.create;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeet,
 * Date:    04/08/24,
 * Time:    3:32 pm
 */
public class ThreadImplementsRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running by implementing runnable interface with name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadImplementsRunnable threadClass = new ThreadImplementsRunnable();
        Thread thread = new Thread(threadClass);
        thread.start();
    }
}