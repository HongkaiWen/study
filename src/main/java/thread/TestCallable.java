package thread;

import java.util.concurrent.*;

/**
 * Created by player on 2015/7/9.
 */
public class TestCallable {
    public static void main(String args[]){
        ExecutorService service = Executors.newFixedThreadPool(1);
        Future<Object> submit = service.submit(new Callable<Object>() {
            @Override
            public Object call() throws Exception {
                throw new Exception("hi");
            }
        });
        try {
            submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            System.out.println("exception from callable" + e.getCause());
            e.printStackTrace();
        }
    }
}
