package string;

import java.util.*;

/**
 * Created by vincent on 2015/8/6.
 */
public class TestString {
    public static void main(String args[]){
        Map<String, String> cases = new LinkedHashMap<String, String>();
        init(cases);
        for(Map.Entry<String, String> case_ : cases.entrySet()){
            System.out.println(String.format("case [%s]", case_.getKey()));
            test("abc", case_.getValue());
            System.out.println();
        }
    }

    private static void test(String a, String b){
        boolean result = (a==b);
        System.out.println(String.format("a==b, result is [%s]", result));
        System.out.println(String.format("a.equals(b), result is [%s]",a.equals(b)));
        if(!result){
            System.out.println("action [String.intern]");
            b = b.intern();
            System.out.println(String.format("a=b, result is [%s]", a==b));
        }
    }

    private static void init(Map<String, String> cases){
        cases.put("a-> \"abc\", b-> \"abc\"", "abc");
        cases.put("a-> \"abc\", b-> \"ab\" + \"c\"", "ab" + "c");
        String c = "c";
        cases.put("c-> \"c\", a-> \"abc\", b-> \"ab\" + c", "ab" + c);
        cases.put("a-> \"abc\", b-> new String(\"abc\")", new String("abc"));
    }
}
