package com.test.ping;

import com.test.netty3.MyChatInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;
//客户端在netty3测试
public class MyServer {
    public static void main(String[] args) throws  Exception{
        EventLoopGroup bossgroup=new NioEventLoopGroup();
        EventLoopGroup workgroup=new NioEventLoopGroup();
        try{

            ServerBootstrap serverBootstrap=new ServerBootstrap();
            serverBootstrap.group(bossgroup, workgroup).channel(NioServerSocketChannel.class)
                    .handler(new LoggingHandler(LogLevel.INFO))
                    .childHandler(new MyServerInitializer());
            ChannelFuture cha = serverBootstrap.bind(80).sync();
            cha.channel().closeFuture().sync();
        }finally {
            bossgroup.shutdownGracefully();
            workgroup.shutdownGracefully();
        }
    }
}
