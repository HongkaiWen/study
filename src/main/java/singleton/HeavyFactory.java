package singleton;

/**
 * Created by player on 2015/6/8.
 */
public class HeavyFactory {

    private HeavyFactory(){

    }

    private static class FactoryHolder{
        private static HeavyFactory factory = new HeavyFactory();
    }

    public static HeavyFactory getInstance(){
        return FactoryHolder.factory;
    }
}
