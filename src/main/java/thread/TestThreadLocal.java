package thread;

import entity.Dog;

/**
 * Created by player on 2015/7/4.
 */
public class TestThreadLocal implements Runnable {
    private ThreadLocal<Dog> dog = new ThreadLocal<Dog>();

    public TestThreadLocal(Dog dog){
        this.dog.set(dog);
    }

    @Override
    public void run() {
        Dog dog = this.dog.get();
        while(!dog.isPei()){
            System.out.println(dog.getName());
        }
        System.out.println(dog.getName());
    }
}
