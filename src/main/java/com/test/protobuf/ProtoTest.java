package com.test.protobuf;
//protoc --java_out=./src/main/java ./src/protobuf/Student.proto

public class ProtoTest {
    public static void main(String[] args) throws Exception{
        DataInfo.Student student = DataInfo.Student.newBuilder()
                .setName("张三").setAge(20).setAddress("北京").build();
        byte[] student2bytearray=student.toByteArray();
        DataInfo.Student student2=DataInfo.Student.parseFrom(student2bytearray);
        System.out.println(student2.getName());
        System.out.println(student2.getAge());
        System.out.println(student2.getAddress());

    }
}
