package concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Created by vincent on 2015/9/1.
 */
public class ThreadSafeUpdate implements OneThreadUpdate {

    private int count;

    @Override
    public synchronized void addBy2() {
        try{
            count ++;
            TimeUnit.SECONDS.sleep(2);
            count ++;
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public synchronized int get() {
        return count;
    }
}
