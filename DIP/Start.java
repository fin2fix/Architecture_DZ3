package DIP;

public class Start {

  public static void main(String[] args) {

    Car car = new Car(new DieselEngine(2.2));
    car.engineStart();

    car.setEngine(new PetrolEngine(3.0));
    car.engineStart();

    car.setEngine(new ElectricEngine(1500));
    car.engineStart();
  }
}
