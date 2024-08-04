package org.java8.concurrent;

import java.util.concurrent.Executor;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeet,
 * Date:    04/08/24,
 * Time:    4:13 pm
 */
public class ExecutorDemo {
    public static void main(String[] args) {
        ExecutorImp executor = new ExecutorImp();
        executor.execute(new ThreadDemo());
    }
}

class ExecutorImp implements Executor {

    @Override
    public void execute(Runnable command) {
        new Thread(command).start();
    }
}

class ThreadDemo implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread execution triggered from executor.");
    }
}