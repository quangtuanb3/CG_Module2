package Animal;
public abstract class Animal {
    private float weight = 1.0f;
    private float height = 1.0f;

    public Animal(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }

    public Animal() {

    }

    public abstract String makeSound();

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
}
