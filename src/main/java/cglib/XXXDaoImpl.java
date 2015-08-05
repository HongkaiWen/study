package cglib;

import annotation.XXXpilipala;
import org.springframework.stereotype.Repository;

/**
 * Created by player on 2015/5/30.
 *
 */
//register bean named 'XXXDaoImpl'
@Repository
//register bean named 'xxxDao'
//@Repository("xxxDao")
public class XXXDaoImpl implements XXXDao {
    @Override
    public void execute() {
        System.out.println(" this is XXX dao");
    }
}
