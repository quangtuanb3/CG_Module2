package Product;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class P_M_LinkedList implements BasicCRUD<Product> {
    LinkedList<Product> linkedListP = new LinkedList<>();

    @Override
    public void add(Product ele) {
        linkedListP.add(ele);
    }

    @Override
    public void update(Product ele) {
        linkedListP.stream()
                .filter(product -> product.getId() == (ele.getId()))
                .findFirst()
                .ifPresent(product -> {
                    linkedListP.set(linkedListP.indexOf(product), ele);
                });
    }

    @Override
    public void print() {
        for (Product p : linkedListP) {
            System.out.println(p.toString());
        }
    }

    @Override
    public void remove(int id) {
        linkedListP = (LinkedList<Product>) linkedListP.stream().filter(e -> e.getId() != id).collect(Collectors.toList());
    }

    @Override
    public List<Product> find(String name) {
        return linkedListP.stream().filter(e -> e.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }

    @Override
    public void sort(boolean ascending) {
        Comparator<Product> comparator = Comparator.comparing(Product::getPrice);
        if (!ascending) {
            comparator = comparator.reversed();
        }
        linkedListP.sort(comparator);
    }
}

