package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.toString());
        Circle cylinder = new Cylinder();
        System.out.println(cylinder.toString());
        Cylinder cylinder1 = new Cylinder();
        System.out.println(cylinder1.toString());
        Cylinder cy = (Cylinder) cylinder;
        System.out.println(cy.toString());
    }
}
