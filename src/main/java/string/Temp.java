package string;

/**
 * Created by player on 2015/8/6.
 */
public class Temp {

    private int i = getI();
    private int b;

    private int getI(){
        return b;
    }

    private static int c = getC();
    static{
        d = 8;
    }
    private static int d;

    private static int getC(){
        return 1;
    }



    public static void main(String args[]){
        String a = "abc";
        String b = "abc";
        System.out.println(a == b);
        System.out.println(Temp.d);
    }
}
