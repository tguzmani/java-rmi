
import java.rmi.Naming;

public class ServerSoprano {
  public static void main(String[] args) {
    System.out.println("Launching server...");
    System.setProperty("java.rmi.server.hostname", Constants.IP_SOPRANO);

    try {
      Calculator calculator = new Calculator();
      Naming.rebind(Constants.URL_SOPRANO, calculator);
      System.out.println("Server listening (" + Constants.IP_SOPRANO + ")");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
