// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Student.proto

package com.test.grpc_proto;

public final class StudentProto {
  private StudentProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_test_grpc_proto_MyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_test_grpc_proto_MyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_test_grpc_proto_MyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_test_grpc_proto_MyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_test_grpc_proto_StudentResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_test_grpc_proto_StudentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_test_grpc_proto_StudentRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_test_grpc_proto_StudentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rStudent.proto\022\023com.test.grpc_proto\"\035\n\t" +
      "MyRequest\022\020\n\010username\030\001 \001(\t\"\036\n\nMyRespons" +
      "e\022\020\n\010realname\030\002 \001(\t\":\n\017StudentResponse\022\014" +
      "\n\004name\030\001 \001(\t\022\013\n\003age\030\002 \001(\005\022\014\n\004city\030\003 \001(\t\"" +
      "\035\n\016StudentRequest\022\013\n\003age\030\001 \001(\0052\317\001\n\016Stude" +
      "ntService\022Z\n\025getRealNameByUsername\022\036.com" +
      ".test.grpc_proto.MyRequest\032\037.com.test.gr" +
      "pc_proto.MyResponse\"\000\022a\n\020getStudentsByAg" +
      "e\022#.com.test.grpc_proto.StudentRequest\032$" +
      ".com.test.grpc_proto.StudentResponse\"\0000\001" +
      "B\'\n\023com.test.grpc_protoB\014StudentProtoH\001P" +
      "\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_test_grpc_proto_MyRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_test_grpc_proto_MyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_test_grpc_proto_MyRequest_descriptor,
        new String[] { "Username", });
    internal_static_com_test_grpc_proto_MyResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_test_grpc_proto_MyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_test_grpc_proto_MyResponse_descriptor,
        new String[] { "Realname", });
    internal_static_com_test_grpc_proto_StudentResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_test_grpc_proto_StudentResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_test_grpc_proto_StudentResponse_descriptor,
        new String[] { "Name", "Age", "City", });
    internal_static_com_test_grpc_proto_StudentRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_test_grpc_proto_StudentRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_test_grpc_proto_StudentRequest_descriptor,
        new String[] { "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
