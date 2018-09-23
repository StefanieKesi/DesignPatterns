package singletonPattern.singletonEfficiencyTest;

import singletonPattern.Hungry;
import singletonPattern.LazyAndThreadSafe;
import singletonPattern.StaticInternalClass;

import java.util.concurrent.CountDownLatch;

public class EfficiencyTest {

    public static void main(String[] args) throws InterruptedException {

        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);
        long start = System.currentTimeMillis();
        for (int i = 0; i < threadNum; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int i = 0; i < 1000000; i++) {
                        LazyAndThreadSafe.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
