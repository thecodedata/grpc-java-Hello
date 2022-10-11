package gfc.helloGRPC;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: Hello.proto")
public final class helloFRPCGrpc {

  private helloFRPCGrpc() {}

  public static final String SERVICE_NAME = "gfc.helloGRPC.helloFRPC";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<gfc.helloGRPC.request,
      gfc.helloGRPC.response> getHelloMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Hello",
      requestType = gfc.helloGRPC.request.class,
      responseType = gfc.helloGRPC.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gfc.helloGRPC.request,
      gfc.helloGRPC.response> getHelloMethod() {
    io.grpc.MethodDescriptor<gfc.helloGRPC.request, gfc.helloGRPC.response> getHelloMethod;
    if ((getHelloMethod = helloFRPCGrpc.getHelloMethod) == null) {
      synchronized (helloFRPCGrpc.class) {
        if ((getHelloMethod = helloFRPCGrpc.getHelloMethod) == null) {
          helloFRPCGrpc.getHelloMethod = getHelloMethod = 
              io.grpc.MethodDescriptor.<gfc.helloGRPC.request, gfc.helloGRPC.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gfc.helloGRPC.helloFRPC", "Hello"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gfc.helloGRPC.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gfc.helloGRPC.response.getDefaultInstance()))
                  .setSchemaDescriptor(new helloFRPCMethodDescriptorSupplier("Hello"))
                  .build();
          }
        }
     }
     return getHelloMethod;
  }

  private static volatile io.grpc.MethodDescriptor<gfc.helloGRPC.request,
      gfc.helloGRPC.response> getByeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Bye",
      requestType = gfc.helloGRPC.request.class,
      responseType = gfc.helloGRPC.response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<gfc.helloGRPC.request,
      gfc.helloGRPC.response> getByeMethod() {
    io.grpc.MethodDescriptor<gfc.helloGRPC.request, gfc.helloGRPC.response> getByeMethod;
    if ((getByeMethod = helloFRPCGrpc.getByeMethod) == null) {
      synchronized (helloFRPCGrpc.class) {
        if ((getByeMethod = helloFRPCGrpc.getByeMethod) == null) {
          helloFRPCGrpc.getByeMethod = getByeMethod = 
              io.grpc.MethodDescriptor.<gfc.helloGRPC.request, gfc.helloGRPC.response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "gfc.helloGRPC.helloFRPC", "Bye"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gfc.helloGRPC.request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  gfc.helloGRPC.response.getDefaultInstance()))
                  .setSchemaDescriptor(new helloFRPCMethodDescriptorSupplier("Bye"))
                  .build();
          }
        }
     }
     return getByeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static helloFRPCStub newStub(io.grpc.Channel channel) {
    return new helloFRPCStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static helloFRPCBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new helloFRPCBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static helloFRPCFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new helloFRPCFutureStub(channel);
  }

  /**
   */
  public static abstract class helloFRPCImplBase implements io.grpc.BindableService {

    /**
     */
    public void hello(gfc.helloGRPC.request request,
        io.grpc.stub.StreamObserver<gfc.helloGRPC.response> responseObserver) {
      asyncUnimplementedUnaryCall(getHelloMethod(), responseObserver);
    }

    /**
     */
    public void bye(gfc.helloGRPC.request request,
        io.grpc.stub.StreamObserver<gfc.helloGRPC.response> responseObserver) {
      asyncUnimplementedUnaryCall(getByeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHelloMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gfc.helloGRPC.request,
                gfc.helloGRPC.response>(
                  this, METHODID_HELLO)))
          .addMethod(
            getByeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                gfc.helloGRPC.request,
                gfc.helloGRPC.response>(
                  this, METHODID_BYE)))
          .build();
    }
  }

  /**
   */
  public static final class helloFRPCStub extends io.grpc.stub.AbstractStub<helloFRPCStub> {
    private helloFRPCStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloFRPCStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloFRPCStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloFRPCStub(channel, callOptions);
    }

    /**
     */
    public void hello(gfc.helloGRPC.request request,
        io.grpc.stub.StreamObserver<gfc.helloGRPC.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bye(gfc.helloGRPC.request request,
        io.grpc.stub.StreamObserver<gfc.helloGRPC.response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getByeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class helloFRPCBlockingStub extends io.grpc.stub.AbstractStub<helloFRPCBlockingStub> {
    private helloFRPCBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloFRPCBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloFRPCBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloFRPCBlockingStub(channel, callOptions);
    }

    /**
     */
    public gfc.helloGRPC.response hello(gfc.helloGRPC.request request) {
      return blockingUnaryCall(
          getChannel(), getHelloMethod(), getCallOptions(), request);
    }

    /**
     */
    public gfc.helloGRPC.response bye(gfc.helloGRPC.request request) {
      return blockingUnaryCall(
          getChannel(), getByeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class helloFRPCFutureStub extends io.grpc.stub.AbstractStub<helloFRPCFutureStub> {
    private helloFRPCFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private helloFRPCFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected helloFRPCFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new helloFRPCFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gfc.helloGRPC.response> hello(
        gfc.helloGRPC.request request) {
      return futureUnaryCall(
          getChannel().newCall(getHelloMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<gfc.helloGRPC.response> bye(
        gfc.helloGRPC.request request) {
      return futureUnaryCall(
          getChannel().newCall(getByeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HELLO = 0;
  private static final int METHODID_BYE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final helloFRPCImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(helloFRPCImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HELLO:
          serviceImpl.hello((gfc.helloGRPC.request) request,
              (io.grpc.stub.StreamObserver<gfc.helloGRPC.response>) responseObserver);
          break;
        case METHODID_BYE:
          serviceImpl.bye((gfc.helloGRPC.request) request,
              (io.grpc.stub.StreamObserver<gfc.helloGRPC.response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class helloFRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    helloFRPCBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return gfc.helloGRPC.Hello.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("helloFRPC");
    }
  }

  private static final class helloFRPCFileDescriptorSupplier
      extends helloFRPCBaseDescriptorSupplier {
    helloFRPCFileDescriptorSupplier() {}
  }

  private static final class helloFRPCMethodDescriptorSupplier
      extends helloFRPCBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    helloFRPCMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (helloFRPCGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new helloFRPCFileDescriptorSupplier())
              .addMethod(getHelloMethod())
              .addMethod(getByeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
