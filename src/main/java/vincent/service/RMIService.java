package vincent.service;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by player on 2015/6/29.
 */
public interface RMIService extends Remote {

    String hello(String input) throws RemoteException;

}
