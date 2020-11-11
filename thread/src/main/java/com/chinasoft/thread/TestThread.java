package com.chinasoft.thread;

public class TestThread extends Thread{
    @Override
    public void run() {
        //run方法 线程体
        for (int i = 0; i < 20; i++) {
            System.out.println("线程体内"+i);
        }
    }

    public static void main(String[] args) {
        //main主线程
        TestThread testThread = new TestThread();
//        开启多线程
        testThread.start();

        for (int i = 0; i < 200; i++) {
            System.out.println("主线程"+i);
        }
    }
}
