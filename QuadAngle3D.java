public class QuadAngle3D implements iShape3D {

  private double side1;
  private double side2;
  private double side3;
  private String color;

  public QuadAngle3D(double side1, double side2, double side3, String color) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.color = color;
  }

  @Override
  public double area3D() {
    return side1 * side2 * side3;
  }

  @Override
  public String toString() {
    return "QuadAngle3D [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + color + "]";
  }
}
