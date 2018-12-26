package com.test.netty_thrift;

import com.test.thrift.PersionService;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;

public class ThriftServer {

    public static void main(String[] args) throws Exception {
        TNonblockingServerSocket tNonblockingServerSocket = new TNonblockingServerSocket(80);
        THsHaServer.Args args1 = new THsHaServer.Args(tNonblockingServerSocket).minWorkerThreads(2).maxWorkerThreads(4);

        PersionService.Processor<PersionServiceImpl> persionServiceProcessor = new PersionService.Processor<>(new PersionServiceImpl());

        args1.protocolFactory(new TCompactProtocol.Factory());
        args1.transportFactory(new TFramedTransport.Factory());
        args1.processorFactory(new TProcessorFactory(persionServiceProcessor));

        THsHaServer server = new THsHaServer(args1);
        System.out.println("thrift server started! ");
        server.serve();
    }
}
