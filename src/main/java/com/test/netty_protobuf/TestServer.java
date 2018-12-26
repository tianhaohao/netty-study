package com.test.netty_protobuf;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class TestServer {
    public static void main(String[] args) throws Exception {
        EventLoopGroup bossgroup=new NioEventLoopGroup();
        EventLoopGroup workgroup=new NioEventLoopGroup();
        try{

            ServerBootstrap serverBootstrap=new ServerBootstrap();
            serverBootstrap.group(bossgroup, workgroup).channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new TestInitializer());
            ChannelFuture cha = serverBootstrap.bind(80).sync();
            cha.channel().closeFuture().sync();
        }finally {
            bossgroup.shutdownGracefully();
            workgroup.shutdownGracefully();
        }
    }
}
