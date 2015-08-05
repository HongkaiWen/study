package test;

import cglib.XXXService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by player on 2015/5/30.
 */
public class SpringXXXClient {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
        XXXService service = (XXXService) context.getBean("xxxService");
        service.execute();
    }
}
