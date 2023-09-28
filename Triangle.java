public class Triangle implements iShape {

  private double side1;
  private double side2;
  private double side3;
  private String color;

  public Triangle(double side1, double side2, double side3, String color) {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
    this.color = color;
  }

  @Override
  public double area() {
    double halfPerimetr = (side1 + side2 + side3) / 2;
    return Math.sqrt(halfPerimetr * (halfPerimetr - side1) * (halfPerimetr - side2) * (halfPerimetr - side3));
  }

  @Override
  public String toString() {
    return "Triangle [side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + ", color=" + color + "]";
  }

}
