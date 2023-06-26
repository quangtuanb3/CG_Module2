package Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ProductManager listProducts = new ProductManager();
        Product p1 = new Product("Samsung", 900, 10);
        Product p2 = new Product("Iphone7", 1200, 110);
        Product p3 = new Product("Iphone8", 1300, 120);
        Product p4 = new Product("Iphone9", 1400, 100);

        listProducts.add(p1);
        listProducts.add(p2);
        listProducts.add(p3);
        listProducts.add(p4);
        System.out.println("Add products");
        listProducts.print();

        listProducts.remove(3);
        System.out.println("Remove id 3");
        listProducts.print();

        p1.setRemain(25);
        System.out.println("set remain p1");
        listProducts.print();

        System.out.println("Sort ascending: ");
        listProducts.sort(true);
        listProducts.print();

        System.out.println("Sort descending: ");
        listProducts.sort(false);
        listProducts.print();

        System.out.println("find Ip");
        ProductManager findP = (ProductManager) listProducts.find("Ip");
        findP.print();


    }

}