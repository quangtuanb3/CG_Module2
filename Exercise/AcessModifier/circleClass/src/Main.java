public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        double r1 = c1.getRadius();
        double a1 = c1.getArea();
        System.out.println(r1 + " " + a1);

        Circle c2 = new Circle(10);
        double r2 = c2.getRadius();
        double a2 = c2.getArea();
        System.out.println(r2 + " " + a2);

    }
}