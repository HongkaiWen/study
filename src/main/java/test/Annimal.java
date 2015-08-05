package test;

/**
 * Created by player on 2015/8/5.
 */
public class Annimal {
    void say(){
        System.out.println("I'm a animal");
    }
    protected void hi(){
        System.out.println("hi, i'm xiaoqiang");
    }

    private void wocao(){
        System.out.println("wo cao");
    }

    class BTest{
        void test(){
            Annimal a = new Annimal();
            a.wocao();
        }
    }
}

class ATest{
    void test(){
        Annimal a = new Annimal();
//        a.w
        a.hi();
        a.say();
    }
}
