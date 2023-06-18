package apj_shape;

import java.util.ArrayList;
import java.util.List;

public class ResizeableTest {
    public static void main(String[] arr) {
        List<Shape> listShape = new ArrayList<Shape>(4);
        Shape c1 = new Circle(3.5, "indigo", false);
//        System.out.println(c1);
        Circle c2 = (Circle) c1;
        double percent = Math.random() * 100;
        c2.resize(Math.floor(percent));
        listShape.add(c1);
        listShape.add(c2);

        Rectangle rec1 = new Rectangle(2.5, 3.8, "orange", true);
        listShape.add(rec1);
        percent = Math.random() * 100;
        Rectangle rec2 = new Rectangle();
        rec2.setLength(rec1.getLength());
        rec2.setWidth(rec1.getWidth());
        rec2.setColor(rec1.getColor());
        rec2.setFilled(rec1.isFilled());
        rec2.resize(percent);
        listShape.add(rec2);

        for (Shape shape : listShape){
            System.out.println(shape);
        }

    }


}
