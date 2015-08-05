package cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by player on 2015/5/27.
 */
public class XXXCglibProxy implements MethodInterceptor {

    private String name;
    private Enhancer enhancer;

    public XXXCglibProxy(String name){
        this.name = name;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        if(!"boss".equals(name)){
            System.out.println("you don't have permission ！");
            return null;
        }

        Object result = null;
        try{
            result = methodProxy.invokeSuper(o, objects);
        }catch(Exception e){
            System.out.println("proxy exception handler !");
        }

        return result;
    }
}
