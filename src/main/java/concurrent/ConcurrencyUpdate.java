package concurrent;

import java.util.concurrent.TimeUnit;

/**
 * Created by player on 2015/9/1.
 */
public class ConcurrencyUpdate implements OneThreadUpdate {

    private volatile int count;

    @Override
    public void addBy2() {
        try {
            int currentCount = count;
            currentCount++;
            TimeUnit.SECONDS.sleep(2);
            currentCount++;
            count = currentCount;
        }catch(InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }

    @Override
    public int get() {
        return count;
    }
}
