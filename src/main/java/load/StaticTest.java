package load;

/**
 * Created by player on 2015/8/12.
 */
public class StaticTest {
    public static String name = "xiaoqiang";
    public static String add;

    static{
        name = "xiaogang";
        add = "suzhou";
        aa = "cc";
        bb = "bb";
            }

    public static String aa = "aa";
    public static String bb;

    public static void main(String args[]){
        System.out.println(StaticTest.name);
        System.out.println(StaticTest.add);
        System.out.println(StaticTest.aa);
        System.out.println(StaticTest.bb);
    }
}
