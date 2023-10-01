package ISP;

public class Cube implements iShape2D, iShape3D {

  private double side;
  private String color;

  public Cube(double side, String color) {
    this.side = side;
    this.color = color;
  }

  @Override
  public double volume() {
    return Math.pow(side, 3);
  }

  @Override
  public double area() {
    return Math.pow(side, 2);
  }

  @Override
  public String toString() {
    return "Cube [ side = " + side + ", color = " + color + " ]";
  }
}
