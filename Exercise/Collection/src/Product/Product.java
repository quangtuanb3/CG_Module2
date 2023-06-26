package Product;

public class Product {

    static int currentId;
    private int id;
    private String name;
    private int price;
    private int remain;

    Product() {
    }

    Product(String name, int price, int remain) {
        this.id = ++currentId;
        this.name = name;
        this.price = price;
        this.remain = remain;
    }

    public static int getCurrentId() {
        return currentId;
    }

    public static void setCurrentId(int currentId) {
        Product.currentId = currentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRemain() {
        return remain;
    }

    public void setRemain(int remain) {
        this.remain = remain;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", remain=" + remain +
                '}';
    }
}
