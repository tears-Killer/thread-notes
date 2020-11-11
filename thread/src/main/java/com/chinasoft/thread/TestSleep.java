package com.chinasoft.thread;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestSleep {
    public static void main(String[] args) throws InterruptedException {
        Date starttime = new Date(System.currentTimeMillis());

        while(true){
            Thread.sleep(1000);
            System.out.println(new SimpleDateFormat("HH:mm:ss").format(starttime));
            starttime = new Date(System.currentTimeMillis());
        }
    }
}
