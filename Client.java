import java.rmi.Naming;

public class Client {
  public static void main(String[] args) {
    int a = 10;
    int b = 5;

    try {
      ICalculator serverSoprano = (ICalculator) Naming.lookup(Constants.URL_SOPRANO);
      ICalculator serverXPS = (ICalculator) Naming.lookup(Constants.URL_XPS);

      System.out.println("[Soprano] 10 + 5 = " + serverSoprano.add(a, b));
      System.out.println("[XPS] 10 * 5 = " + serverXPS.times(a, b));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}