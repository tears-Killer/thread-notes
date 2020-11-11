package com.chinasoft.thread;

public class TestDaemon {
    public static void main(String[] args) {
        God god = new God();
        Person person = new Person();
        Thread thread = new Thread(god);
        thread.setDaemon(true);
        thread.start();
        new Thread(person).start();
    }
}
class God implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("上帝保佑你");
        }
    }
}

class Person implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("还有"+i);
        }
    }
}