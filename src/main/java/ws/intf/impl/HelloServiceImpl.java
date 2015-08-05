package ws.intf.impl;

import ws.intf.HelloService;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;



/**
 * blog http://www.micmiu.com
 *
 * @author Michael
 */
@WebService()
//默认SOAPBinding style = Style.DOCUMENT
@SOAPBinding()
public class HelloServiceImpl implements HelloService {

	@WebMethod
	public String sayHello(@WebParam(name = "userName") String userName) {
		return "hi," + userName + " welcom to www.micmiu.com";
	}

}