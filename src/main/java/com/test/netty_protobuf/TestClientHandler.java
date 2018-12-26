package com.test.netty_protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Random;

public class TestClientHandler extends SimpleChannelInboundHandler<MyDataInfo.MyMessage> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MyDataInfo.MyMessage msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        int randomInt =new Random().nextInt(3);
        MyDataInfo.MyMessage.Builder builder = MyDataInfo.MyMessage.newBuilder();
        if (0==randomInt){
            MyDataInfo.Persion persion = MyDataInfo.Persion.newBuilder()
                    .setName("张三").setAddress("北京").setAge(20).build();
            MyDataInfo.MyMessage myMessage = builder.setDataType(MyDataInfo.MyMessage.DataType.PersionType).setPersion(persion).build();
            ctx.channel().writeAndFlush(myMessage);
        }else if(1==randomInt){
            MyDataInfo.Dog dog = MyDataInfo.Dog.newBuilder().setName("dog").setAge(10).build();
            MyDataInfo.MyMessage myMessage = builder.setDataType(MyDataInfo.MyMessage.DataType.DogType).setDog(dog).build();
            ctx.channel().writeAndFlush(myMessage);
        }else{
            MyDataInfo.Cat cat = MyDataInfo.Cat.newBuilder().setName("cat").setCity("cat_city").build();
            MyDataInfo.MyMessage myMessage = builder.setDataType(MyDataInfo.MyMessage.DataType.CatTyp).setCat(cat).build();
            ctx.channel().writeAndFlush(myMessage);
        }


    }
}
