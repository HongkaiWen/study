package test;

/**
 * Created by player on 2015/6/8.
 */
public class StaticClass {

    public static void main(String args[]){
        new StaticClass().pp();
    }

    private void pp(){
        new InnerClass().print();
    }

    private static class InnerClass{
        public void print(){
            System.out.println("test");
        }
    }
}
