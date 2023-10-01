package DIP;

public class Car {

  private iEngine engine;

  public Car(iEngine engine) {
    this.engine = engine;
  }

  public void engineStart() {
    this.engine.start();
  }

  public void setEngine(iEngine engine) {
    this.engine = engine;
  }
}