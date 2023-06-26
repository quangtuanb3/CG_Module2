//package Product;
//
//public class Comparator implements java.util.Comparator<Product> {
//    public int compare(boolean ascending, Product o1, Product o2) {
//        return intCompare(ascending, o1.getPrice(), o2.getPrice());
//    }
//
//    public static int intCompare(boolean ascending, int x, int y) {
//        if (ascending) {
//            return Integer.compare(x, y);
//        }
//        return Integer.compare(y, x);
//    }
//
//    @Override
//    public int compare(Product o1, Product o2) {
//        return Integer.compare(o1.getPrice(), o2.getPrice());
//    }
//}
