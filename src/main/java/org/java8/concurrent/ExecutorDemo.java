package org.java8.concurrent;

import java.util.concurrent.Executor;

/**
 * Created using IntelliJ IDEA.
 * Author:  abhijeet,
 * Date:    04/08/24,
 * Time:    4:13 pm
 * <p>
 * The concurrent API in Java provides a feature known as an executor that initiates and controls the execution of threads. As such, an executor offers an alternative to managing threads using the thread class. At the core of an executor is the Executor interface. It refers to the objects that execute submitted Runnable tasks.
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