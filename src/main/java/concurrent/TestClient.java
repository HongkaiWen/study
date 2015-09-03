package concurrent;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by vincent on 2015/9/1.
 */
public class TestClient {

    //start gate
    private static final CountDownLatch startGate = new CountDownLatch(1);

    //thread pools
    private static final ExecutorService updatePool = Executors.newSingleThreadExecutor();
    private static final ExecutorService queryPool =new ThreadPoolExecutor(0, 100, 0, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());

    //after 20 times add action, stop the query action
    private static volatile boolean overFlag = false;

    private static AtomicInteger queryTimes = new AtomicInteger();

//    private static OneThreadUpdate updater = new ThreadSafeUpdate();
    private static OneThreadUpdate updater = new ConcurrencyUpdate();

    public static void main(String args[]){
        updatePool.execute(new UpdateTask());
        for(int i=0; i<10; i++){
            queryPool.execute(new QueryTask());
        }
        startGate.countDown();
        Runtime.getRuntime().addShutdownHook(new Thread(){
            public void run() {
                System.out.println("query times : " + queryTimes.intValue());
            }
        });
    }

    static class QueryTask implements Runnable{

        @Override
        public void run() {
            try {
                startGate.await();
                while(!overFlag){
                    updater.get();
                    queryTimes.incrementAndGet();
                }
            } catch (InterruptedException e) {

            }
        }
    }

    static class UpdateTask implements Runnable{
        @Override
        public void run() {
            try {
                startGate.await();
                int count = 0;
                while (count < (10 * 2)) {
                    updater.addBy2();
                    count = updater.get();
                }
                overFlag = true;
            }catch(InterruptedException e){

            }

        }
    }

}



