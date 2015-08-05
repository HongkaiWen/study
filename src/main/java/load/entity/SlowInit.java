package load.entity;

import java.util.concurrent.TimeUnit;

/**
 * Created by player on 2015/7/29.
 */
public class SlowInit {
    static{
        System.out.println(Thread.currentThread().getName() + " class SlowInit begin to init static block");
        try{
            TimeUnit.SECONDS.sleep(5);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " class SlowInit static block init over");
    }

    public static void say(){
        System.out.println(Thread.currentThread().getName() + " say: hi~" );
    };
}
