package com.test.netty_protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestServerhandler extends SimpleChannelInboundHandler<MyDataInfo.Persion> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.Persion msg) throws Exception {
        System.out.println(msg.getName());
        System.out.println(msg.getAddress());
        System.out.println(msg.getAge());
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        System.out.println("出错！");
        ctx.close();
    }
}
