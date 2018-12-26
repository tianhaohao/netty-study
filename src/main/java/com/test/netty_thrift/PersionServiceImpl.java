package com.test.netty_thrift;

import com.test.thrift.DataException;
import com.test.thrift.Persion;
import com.test.thrift.PersionService;
import org.apache.thrift.TException;

public class PersionServiceImpl implements PersionService.Iface {
    @Override
    public Persion getPersionByUsername(String username) throws DataException, TException {
        System.out.println("get client persion" + username);
        Persion persion = new Persion();
        persion.setUsername(username);
        persion.setAge(20);
        persion.setMarreid(false);
        return persion;
    }

    @Override
    public void savePersion(Persion persion) throws DataException, TException {
        System.out.println("get client persion:");
        System.out.println(persion.getUsername());
        System.out.println(persion.getAge());
        System.out.println(persion.marreid);
    }
}
