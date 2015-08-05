package test;

import java.util.Arrays;
import java.util.List;

/**
 * Created by player on 2015/6/30.
 */
public class T {
    public static void main(String args[]){
        List l = Arrays.asList(args);
        System.out.println(l.toArray());
        System.out.println(l.toArray(new Object[0]));
    }
}
