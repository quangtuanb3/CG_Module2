package Animal;

public abstract class Fruit implements Edible{
    private String color = "green";
    private String tasty = "sweet";

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTasty() {
        return tasty;
    }

    public void setTasty(String tasty) {
        this.tasty = tasty;
    }


    public abstract String toString() ;
}
