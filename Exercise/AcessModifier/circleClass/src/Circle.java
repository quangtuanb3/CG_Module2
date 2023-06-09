public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    protected Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
