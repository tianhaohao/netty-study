package com.test.netty2;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class MyServer {
    public static void main(String[] args) throws Exception {
        EventLoopGroup bossgroup=new NioEventLoopGroup();
        EventLoopGroup workgroup=new NioEventLoopGroup();
        try{

            ServerBootstrap serverBootstrap=new ServerBootstrap();
            serverBootstrap.group(bossgroup, workgroup).channel(NioServerSocketChannel.class)
                    .childHandler(new MyServerInitializer());
            ChannelFuture cha = serverBootstrap.bind(80);
            cha.channel().closeFuture().sync();
        }finally {
            bossgroup.shutdownGracefully();
            workgroup.shutdownGracefully();
        }
    }
}
