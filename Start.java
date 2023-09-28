public class Start {

  public static void main(String[] args) {

    Circle circle = new Circle(4.5, "green");
    System.out.println("\n" + circle);
    System.out.println("Площадь круга = " + circle.area());

    Circle3D circle3D = new Circle3D(4.5, "yellow");
    System.out.println("\n" + circle3D);
    System.out.println("Объем шара = " + circle3D.area3D());
  }
}
