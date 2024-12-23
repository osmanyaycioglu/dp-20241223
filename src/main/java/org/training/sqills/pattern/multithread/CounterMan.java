package org.training.sqills.pattern.multithread;

import java.util.concurrent.CountDownLatch;

public class CounterMan {
    public static void main(String[] args) {
        CountDownLatch countDownLatchLoc = new CountDownLatch(5);
        for (int i = 0; i < 5; i++) {
            MyCounterThread myCounterThreadLoc = new MyCounterThread(countDownLatchLoc);
            myCounterThreadLoc.start();
        }
        try {
            countDownLatchLoc.await();
            System.out.println("Counter : " + MyCounterThread.counter);
            System.out.println("Counter2 : " + MyCounterThread.aLong.get());
        } catch (Exception exp) {
        }

    }
}
