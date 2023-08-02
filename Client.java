// imports a library which imports the Remote Method Invocation 
import java.rmi.*;

public class Client {

    public Client () {}

    public static void main(String[] args) {
        // Defaults to local host if empty
        // "127.0.0" is local host
        String host = (args.length < 1) ? "127.0.0" : args[0]; 
        try {
            Addition add = (Addition) Naming.lookup(String.format("//%s/Addition", host));

            System.out.println(add.sum2nums(69, 420));

        } catch (Exception error) {
            // prints error
            System.out.println(error);
        }

    }

}