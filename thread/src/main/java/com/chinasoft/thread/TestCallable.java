package com.chinasoft.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class TestCallable implements Callable {
    @Override
    public String call() throws Exception {
        for (int i = 0; i < 20; i++) {
            System.out.println("线程体内"+i);
        }

        return "success";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        TestCallable testCallable = new TestCallable();
        FutureTask<String> ft = new FutureTask<String>(testCallable);
        Thread thread = new Thread(ft);
        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("主线程"+i);
        }
        System.out.println(ft.get());//success
    }
}
