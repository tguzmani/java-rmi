import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements ICalculator {
  public Calculator() throws RemoteException {
    super();
  }

  public int add(int a, int b) {
    return a + b;
  }

  public int times(int a, int b) {
    return a * b;
  }
}
