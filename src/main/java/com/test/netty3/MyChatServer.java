package com.test.netty3;

import com.test.netty2.MyServerInitializer;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class MyChatServer {
    public static void main(String[] args) throws  Exception{
        EventLoopGroup bossgroup=new NioEventLoopGroup();
        EventLoopGroup workgroup=new NioEventLoopGroup();
        try{

            ServerBootstrap serverBootstrap=new ServerBootstrap();
            serverBootstrap.group(bossgroup, workgroup).channel(NioServerSocketChannel.class)
                    .childHandler(new MyChatInitializer());
            ChannelFuture cha = serverBootstrap.bind(80).sync();
            cha.channel().closeFuture().sync();
        }finally {
            bossgroup.shutdownGracefully();
            workgroup.shutdownGracefully();
        }
    }
}
