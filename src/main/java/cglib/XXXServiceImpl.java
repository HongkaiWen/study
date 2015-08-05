package cglib;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by player on 2015/5/27.
 */
@Service("xxxService")
public class XXXServiceImpl implements XXXService {

    /**
     * autwired can worked with private properties
     */
//    @Autowired
//    @Qualifier("xxxDao")
//    private XXXDao xXXDao;

    @Override
    public void execute() {
        xXXDao.execute();
    }

    /**
     * JSR-250
     */
    @Resource(name="XXXDaoImpl")
    private XXXDao xXXDao;
}
