package ws.client;

import ws.intf.HelloService;
import ws.intf.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;



/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 */
public class ServerStart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("start publish jax-ws ...");
		HelloService service = new HelloServiceImpl();
		Endpoint.publish("http://localhost:8082/HelloService", service);
		System.out.println("publish webservice successful");
	}

}