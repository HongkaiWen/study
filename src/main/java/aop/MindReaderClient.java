package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by player on 2015/5/31.
 */
public class MindReaderClient {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("/spring/applicationContext.xml");
        Thinker thinker = (Thinker) context.getBean("thinker");
        thinker.thinkOfSomThing("I am niubi");
        MindReader mindReader = (MindReader) context.getBean("mindReader");
        System.out.println(mindReader.getThoughts());
    }

}
