package com.chinasoft.thread;

public class TestYield {

    public static void main(String[] args) {
        MyYield m1 = new MyYield();
        MyYield m2 = new MyYield();
        new Thread(m1,"a").start();
        new Thread(m2,"b").start();
    }


}
class MyYield implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行了");
        Thread.yield();
        System.out.println(Thread.currentThread().getName()+"执行完了");
    }
}