package Point;

public class Main {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(3.0f,6.0f);
        System.out.println(point.toString());
        System.out.println(point.move().move().move().toString());
    }


}
