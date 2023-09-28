package DIP;

public class ElectricEngine implements iEngine {

  private double power;

  public ElectricEngine(double power) {
    this.power = power;
  }

  @Override
  public void start() {
    System.out.println("ELECTRIC engine with power " + power + " has been started");
  }
}
