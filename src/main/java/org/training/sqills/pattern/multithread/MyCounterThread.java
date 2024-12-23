package org.training.sqills.pattern.multithread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicLong;

public class MyCounterThread extends Thread {
    public static long           counter = 0;
    public static AtomicLong     aLong   = new AtomicLong();
    private       CountDownLatch countDownLatch;

    public MyCounterThread(final CountDownLatch countDownLatchParam) {
        countDownLatch = countDownLatchParam;
    }

    public static synchronized void increase() {
        counter++;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10_000_000; i++) {
            // increase();
            // aLong.incrementAndGet();
            counter++;
        }
        countDownLatch.countDown();
    }
}
