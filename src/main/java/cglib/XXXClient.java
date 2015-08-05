package cglib;

/**
 * Created by player on 2015/5/27.
 */
public class XXXClient {

    public static void main(String args[]){
        XXXCglibProxy p1 = new XXXCglibProxy("boss");
        XXXCglibProxy p2 = new XXXCglibProxy("sister");
        XXXServiceFactory.getXXXServiceProxy(p1).execute();
//        XXXServiceFactory.getXXXServiceProxy(p2).execute();
    }
}
