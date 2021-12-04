import java.rmi.Naming;
import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("a = ");
    int a = scanner.nextInt();

    System.out.print("b = ");
    int b = scanner.nextInt();

    scanner.close();

    try {
      ICalculator serverSoprano = (ICalculator) Naming.lookup(Constants.URL_SOPRANO);
      ICalculator serverXPS = (ICalculator) Naming.lookup(Constants.URL_XPS);

      System.out.println("[Soprano] " + a + " + " + b + " = " + serverSoprano.add(a, b));
      System.out.println("[XPS] " + a + " * " + b + " = " + serverXPS.times(a, b));

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}