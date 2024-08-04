package org.java8.thread.create;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeet,
 * Date:    04/08/24,
 * Time:    3:27 pm
 */
public class ThreadByExtendThread extends Thread {

    public void run() {
        System.out.println("Thread is running by extending thread class with name: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadByExtendThread thread = new ThreadByExtendThread();
        thread.start();
    }
}