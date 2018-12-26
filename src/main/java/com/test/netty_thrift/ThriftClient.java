package com.test.netty_thrift;

import com.test.thrift.Persion;
import com.test.thrift.PersionService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;

public class ThriftClient {
    public static void main(String[] args) {
        TFramedTransport transport = new TFramedTransport(new TSocket("localhost", 80), 600);
        TCompactProtocol tCompactProtocol = new TCompactProtocol(transport);
        PersionService.Client client = new PersionService.Client(tCompactProtocol);
        try {
            transport.open();
            Persion persion = client.getPersionByUsername("张三");
            System.out.println(persion.getUsername());
            System.out.println(persion.getAge());
            System.out.println(persion.marreid);
            System.out.println("-----------------------");
            Persion persion2 = new Persion();
            persion2.setUsername("李四");
            persion2.setAge(20);
            persion2.setMarreid(false);
            client.savePersion(persion2);
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e.getMessage(), e);
        } finally {
            transport.close();
        }
    }
}
