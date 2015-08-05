package cglib;

import org.springframework.stereotype.Component;

/**
 * Created by player on 2015/5/30.
 */
@Component("txManager")
public class TransactionManager {
    public void beginTx(){
        System.out.println("begin tx");
    }

    public void commitTx(){
        System.out.println("commit tx");
    }

    public void rollbackTx(){
        System.out.println("rollback tx");
    }
}
