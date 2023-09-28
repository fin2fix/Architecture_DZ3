public class Circle3D implements iShape3D {

  private double radius;
  private String color;

  public Circle3D(double radius, String color) {
    this.radius = radius;
    this.color = color;
  }

  @Override
  public double area3D() {
    return Math.PI * Math.pow(radius, 3) * 3 / 4;
  }

  @Override
  public String toString() {
    return "Circle3D [ radius = " + radius + " см, color = " + color + " ]";
  }
}
