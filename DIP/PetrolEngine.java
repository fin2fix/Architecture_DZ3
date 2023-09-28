package DIP;

public class PetrolEngine implements iEngine {

  private double volume;

  public PetrolEngine(double volume) {
    this.volume = volume;
  }

  @Override
  public void start() {
    System.out.println("PETROL engine with volume " + volume + " has been started");
  }
}
