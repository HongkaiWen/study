package load;

import load.entity.SlowInit;
import sun.java2d.SurfaceDataProxy;

import java.util.concurrent.CountDownLatch;

/**
 * Created by player on 2015/7/29.
 */
public class ConcurrencyTest {

    private static CountDownLatch startGate = new CountDownLatch(1);

    public static void main(String args[]){
        for(int i=0; i<100; i++){
            new Thread(task).start();
        }
        startGate.countDown();
    }

    private static Runnable task = new Runnable() {
        @Override
        public void run() {
            try {
                startGate.await();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            SlowInit.say();
        }
    };
}


