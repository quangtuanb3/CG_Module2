public class Test {
    public static void main(String[] args) {
        MyList<Integer> numbers = new MyList<>(10);
        numbers.add(10);
        numbers.add(9);
        numbers.add(0, 1);
        System.out.println(numbers.contains(9));
        System.out.println(numbers.indexOf(10));
        numbers.print();
    }

}