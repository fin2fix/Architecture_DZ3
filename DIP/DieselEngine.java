package DIP;

public class DieselEngine implements iEngine {

  private double volume;

  public DieselEngine(double volume) {
    this.volume = volume;
  }

  @Override
  public void start() {
    System.out.println("DIESEL engine with volume " + volume + " has been started");
  }
}
