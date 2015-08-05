package classname;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by player on 2015/5/31.
 */
public class Client {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/classname.xml");
    }
}
