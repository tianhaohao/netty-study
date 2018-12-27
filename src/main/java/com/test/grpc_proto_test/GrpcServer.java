package com.test.grpc_proto_test;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.util.concurrent.TimeUnit;

public class GrpcServer {
    private Server server;
    private void start() throws Exception{
        server = ServerBuilder.forPort(80)
                .addService(new StudentServiceImpl()).build().start();
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                System.out.println("runtime halt");
            }
        });
        System.out.println("server is started!");
    }
    private void stop(){
        if(null==this.server){
            this.server.shutdown();
        }
    }
    private void awaitTermination() throws InterruptedException {
        if(null!=this.server){
            this.server.awaitTermination(3, TimeUnit.SECONDS);
            System.out.println("退出！");
        }
    }

    public static void main(String[] args) throws Exception {
        GrpcServer server = new GrpcServer();
        server.start();

        server.awaitTermination();
    }
}
