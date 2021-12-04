
import java.rmi.Naming;

public class ServerXPS {
  public static void main(String[] args) {
    System.out.println("Launching server...");
    System.setProperty("java.rmi.server.hostname", Constants.IP_XPS);

    try {
      Calculator calculator = new Calculator();
      Naming.rebind(Constants.URL_XPS, calculator);
      System.out.println("Server listening (" + Constants.IP_XPS + ")");

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
