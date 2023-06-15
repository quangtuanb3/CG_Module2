import Animal.Chicken;
import Animal.Fruit;

public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken(2.0f, 1.0f);
        System.out.println(chicken.makeSound());
        System.out.println(chicken.howToEat());
        System.out.println(chicken.getHeight());
        System.out.println(chicken.getWeight());

        Fruit orange = new Fruit() {
            @Override
            public String toString() {
                return super.getColor() + " " +
                        super.getTasty() + " " +
                        this.howToEat();
            }

            @Override
            public String howToEat() {
                return "Swallow";
            }
        };

        System.out.println(orange.toString());
    }
}