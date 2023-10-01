package ISP;

public class Circle implements iShape2D, iShape3D {

  private double radius;
  private String color;

  public Circle(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public double volume() {
    return Math.PI * Math.pow(radius, 3) * 3 / 4;
  }

  @Override
  public String toString() {
    return "Circle [ radius = " + radius + " см, color = " + color + " ]";
  }
}
