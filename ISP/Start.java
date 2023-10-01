package ISP;

public class Start {

  public static void main(String[] args) {

    Circle circle = new Circle(4.5, "green");
    System.out.println("\n" + circle);
    System.out.println("Площадь круга = " + circle.area());
    System.out.println("Объем шара = " + circle.volume());

    Cube cube = new Cube(8, "red");
    System.out.println("\n" + cube);
    System.out.println("Площадь грани куба = " + cube.area());
    System.out.println("Объем куба = " + cube.volume());

  }
}
