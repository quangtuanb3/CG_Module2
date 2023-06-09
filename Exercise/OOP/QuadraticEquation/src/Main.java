public class Main {
    public static void main(String[] args) {
        QuadraticEquation equation = new QuadraticEquation(1, 3, 1);
        double delta = equation.getDiscriminant();
        Double x1 = equation.getRoot1();
        Double x2 = equation.getRoot2();
        equation.display();
        if (x1 == null) {
            System.out.println("Equation has no root");
            return;
        }
        if (delta == 0) {
            System.out.println("Equation has duplicate roots: " + x1);
        } else System.out.printf("x1 = %f,\t x2 = %f", x1, x2);
    }
}