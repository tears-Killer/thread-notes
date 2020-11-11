package com.chinasoft.thread;

public class TestRunable implements Runnable{
    @Override
    public void run() {
        //run方法 线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("线程体内"+i);
        }
    }

    //main主线程
    public static void main(String[] args) {
        //创建Runable接口实现类对象
        TestRunable testThread2 = new TestRunable();
//        创建线程对象
        Thread thread = new Thread(testThread2);
//        开启多线程
        thread.start();
        for (int i = 0; i < 200; i++) {
            System.out.println("主线程"+i);
        }
    }
}
