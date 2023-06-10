import java.util.Objects;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    private int speed;
    boolean on;
    private double radius;
    private String color;

    public int getSpeed() {
        return this.speed;
    }

    public Fan() {
        this.speed = SLOW;
        this.on = false;
        this.radius = 5;
        this.color = "blue";
    }

    public Fan(String speed, double radius, String color, String status) {
        this.setSpeed(speed);
        this.radius = radius;
        this.color = color;
        this.setStatus(status);

    }

    public String toString() {
        if (this.on) {
            return "Fan is on: speed " + this.speed + ", color " + this.color + ", radius " + this.radius;
        } else
            return "Fan is off: color " + this.color + ", radius " + this.radius;
    }

    public void setSpeed(String speed) {
        switch (speed) {
            case "medium":
                this.speed = MEDIUM;
                break;
            case "fast":
                this.speed = FAST;
                break;
            default:
                this.speed = SLOW;
                break;
        }
    }

    public void setStatus(String status) {
        this.on = status.equals("on");

    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
