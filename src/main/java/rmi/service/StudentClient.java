package rmi.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vincent.service.StudentService;

/**
 * Created by player on 2015/6/30.
 */
public class StudentClient {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
        StudentService service = (StudentService) context.getBean("studentService");
        System.out.println(service.getStudent().getName());
    }
}
