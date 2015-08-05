package rmi.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import vincent.service.RMIService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created by player on 2015/6/29.
 */
public class RmiClient {

    public static void main(String args[]){
        try {
            RMIService service = (RMIService) Naming.lookup("rmi://localhost:8888/RHello");
            String result = service.hello("abc");
            System.out.println(result);
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
