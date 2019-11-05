package deu.java.team01.server;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServerMain {
    private static final Logger logger = LoggerFactory.getLogger(ServerMain.class);
    public static void main(String[] args) {
        Server server = new Server();
        server.startServer();
    }
}