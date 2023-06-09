public class Main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        double area1 = rectangle1.getArea();
        double perimeter1 = rectangle1.getPerimeter();
        System.out.printf("Rectangle 1 : area = %f,\t perimeter = %f\n", area1, perimeter1);

        Rectangle rectangle2 = new Rectangle(10, 5);
        double area2 = rectangle2.getArea();
        double perimeter2 = rectangle2.getPerimeter();
        System.out.printf("Rectangle 1 : area = %f,\t perimeter = %f\n", area2, perimeter2);
        rectangle2.display();
    }
}