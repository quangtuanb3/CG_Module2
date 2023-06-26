package Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProductManager implements BasicCRUD<Product> {

    static ArrayList<Product> listProducts = new ArrayList<>();


    @Override
    public void add(Product ele) {
        listProducts.add(ele);
    }

    @Override
    public void print() {
        for (Product p : listProducts) {
            System.out.println(p.toString());
        }
    }

    @Override
    public void remove(int id) {
        listProducts = (ArrayList<Product>) listProducts.stream().filter(e -> e.getId() != id).collect(Collectors.toList());
    }

    @Override
    public List<Product> find(String name) {
        return listProducts.stream().filter(e -> e.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }


    @Override
    public void update(Product ele) {
        listProducts.stream()
                .filter(product -> product.getId() == (ele.getId()))
                .findFirst()
                .ifPresent(product -> {
                    listProducts.set(listProducts.indexOf(product), ele);
                });

    }

    @Override
    public void sort(boolean ascending) {
        Comparator<Product> comparator = Comparator.comparing(Product::getPrice);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        listProducts.sort(comparator);
    }


}
