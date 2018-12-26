package com.test.netty_protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TestClientHandler extends SimpleChannelInboundHandler<MyDataInfo.Persion> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.Persion msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        MyDataInfo.Persion persion = MyDataInfo.Persion.newBuilder()
                .setName("张三").setAddress("北京").setAge(20).build();
        ctx.channel().writeAndFlush(persion);
    }
}
