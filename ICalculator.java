import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ICalculator extends Remote {
  int add(int a, int b) throws RemoteException;

  int times(int a, int b) throws RemoteException;
}