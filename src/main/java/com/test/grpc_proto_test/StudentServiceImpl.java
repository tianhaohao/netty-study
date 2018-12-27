package com.test.grpc_proto_test;

import com.test.grpc_proto.MyRequest;
import com.test.grpc_proto.MyResponse;
import com.test.grpc_proto.StudentServiceGrpc;
import io.grpc.stub.StreamObserver;

public class StudentServiceImpl extends StudentServiceGrpc.StudentServiceImplBase{
    @Override
    public void getRealNameByUsername(MyRequest request, StreamObserver<MyResponse> responseObserver) {
        System.out.println("接收到客户端信息："+request.getUsername());
        responseObserver.onNext(MyResponse.newBuilder().setRealname("张三").build());
        responseObserver.onCompleted();
    }
}
