package thread;

import thread.entity.Counter;

import java.util.concurrent.*;

/**
 * Created by player on 2015/6/17.
 */
public class Test1 {
    public static void main(String args[]){
       final Counter counter = new Counter();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = counter.getCount();

                count ++;
                try {
                    TimeUnit.SECONDS.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter.setCount(count);
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int count = counter.getCount();

                count ++;
                try {
                    TimeUnit.SECONDS.sleep(3);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter.setCount2(count);
            }
        });
        t.start();
        t2.start();
        try {
            TimeUnit.SECONDS.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }
}
