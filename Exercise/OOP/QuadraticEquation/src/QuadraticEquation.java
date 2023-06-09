public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }

    public Double getRoot1() {
        if (this.getDiscriminant() < 0) {
            return null;
        }
        return (-this.b + Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public Double getRoot2() {
        if (this.getDiscriminant() < 0) {
            return null;
        }
        return (-this.b - Math.sqrt(this.getDiscriminant())) / (2 * this.a);
    }

    public void display() {
        System.out.printf("%fx^2 + %fx + %f = 0 \n", this.a, this.b, this.c);
    }
}
