package thread;

import entity.Dog;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by player on 2015/7/4.
 */
public class Client {

    private static ThreadLocal<Dog> dog = new ThreadLocal<Dog>();

    private static volatile Dog tail = new Dog("xiao gang");

    public static void main(String args[]) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(2);
        service.execute(new Runnable() {
            @Override
            public void run() {
                dog.set(tail);
                while(!dog.get().isPei()){
                    System.out.println(dog.get().getName()  + "     " + tail.getName());
                }
            }
        });
        service.execute(new Runnable() {
            @Override
            public void run() {
                tail.setName("xiao ming");
                System.out.println(" set xiao ming");
                tail.setPei(true);
            }
        });

    }
}
