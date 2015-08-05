package cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by player on 2015/5/27.
 */
public class XXXServiceFactory {

    public static XXXService getXXXService(){
        return new XXXServiceImpl();
    }

    public static XXXService getXXXServiceProxy(XXXCglibProxy myProxy){
        Enhancer en = new Enhancer();
        //进行代理
        en.setSuperclass(XXXServiceImpl.class);
        en.setCallback(myProxy);
        //生成代理实例
        return (XXXService)en.create();
    }
}
