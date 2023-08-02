import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Addition extends Remote {
    int sum2nums(int num1, int num2) throws RemoteException;

    void appendToNums(int num) throws RemoteException;

    void printNums() throws RemoteException;
}