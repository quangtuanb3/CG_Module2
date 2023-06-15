package Animal;

public class Chicken extends Animal implements Edible{
    public Chicken(float weight, float height) {
        super(weight, height);
    }

    @Override
    public String makeSound() {
        return "chip chip";
    }

    @Override
    public String howToEat() {
        return "roast";
    }
}
