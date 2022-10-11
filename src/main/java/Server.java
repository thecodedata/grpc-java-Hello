import io.grpc.ServerBuilder;
import service.ServiceImpl;

import java.io.IOException;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        io.grpc.Server server = ServerBuilder.forPort(8000).addService(new ServiceImpl()).build().start();
        server.awaitTermination();
    }
}
