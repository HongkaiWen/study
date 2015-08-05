package thread.entity;

/**
 * Created by player on 2015/7/10.
 */
public class Counter {
    private int count;

    public synchronized int getCount() {
        return count;
    }

    public synchronized void setCount(int count) {
        this.count = count;
    }

    public synchronized int getCount2() {
        return count;
    }

    public synchronized void setCount2(int count) {
        this.count = count;
    }
}
