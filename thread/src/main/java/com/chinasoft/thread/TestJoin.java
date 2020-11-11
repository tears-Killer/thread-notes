package com.chinasoft.thread;

public class TestJoin {
    public static void main(String[] args) throws InterruptedException {
        MyJoin myJoin = new MyJoin();
        Thread thread = new Thread(myJoin);
        thread.start();

        for (int i = 0; i < 200; i++) {
            if(i==100){
                thread.join();
            }
            System.out.println("主线程内"+i);
        }
    }
}
class MyJoin implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("线程体内"+i);
        }
    }
}