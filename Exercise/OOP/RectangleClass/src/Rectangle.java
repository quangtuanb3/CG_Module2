public class Rectangle {
    private final double width;
    private final double height;

    public Rectangle() {
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public void display() {
        for (double i = 0; i < this.height; i++) {
            for (double j = 0; j < this.width; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
