public class StringPool {
    public static void main(String[] args) {
        String s1 = "Python";
        String s2 = "Java";
        String s3 = "Python";
        String s4 = new String("Python");
        String s5 = new String("Java");
        String s6 = new String("Java").intern();
        System.out.println((s1 == s3) + ", String are equal."); // true
        System.out.println((s2 == s5) + ", String are not equal."); // false
        System.out.println((s2 == s6) + ", String are equal."); // true
    }
}
