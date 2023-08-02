import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server extends AdditionImplementation {
    public Server() throws RemoteException {
    }

    public static void main(String args[]) {
        try {
            // create stub
            Server stubby = new Server();
            Addition stub = (Addition) UnicastRemoteObject.exportObject(stubby, 0);

            // connect stub to RMI registry
            Registry registry = LocateRegistry.getRegistry();
            registry.rebind("Addition", stub);

            System.out.println("Server Ready");
        } catch (Exception error) {
            System.out.println(error);
        }
    }
}