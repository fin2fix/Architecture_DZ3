public class Circle implements iShape {

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
  public String toString() {
    return "Circle [ radius = " + radius + " см, color = " + color + " ]";
  }

}
