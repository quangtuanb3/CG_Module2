public class Main {
    public static void main(String[] args) {
        System.out.println(">>>>>>>>>>String builder");
        StringBuilder str1 = new StringBuilder();
        System.out.println("str1" + str1);
        System.out.println(str1.capacity());
        StringBuilder str11 = new StringBuilder(100);
        System.out.println(str11.capacity());
        StringBuilder str = new StringBuilder("Hello ");
        System.out.println(str);

        str.append(500);
        System.out.println(str);

        str.append(" anh em");
        System.out.println(str);

        str.insert(str.length(), " C04");
        System.out.println(str);

        str.replace(6, 9, "600");
        System.out.println(str);

        str.delete(6, 10);
        System.out.println(str);

        System.out.println(">>>>>>>>>String buffer");
        StringBuffer str2 = new StringBuffer("Hello ");
        System.out.println(str2);

        str2.append(500);
        System.out.println(str2);

        str2.append(" anh em");
        System.out.println(str2);

        str2.insert(str.length(), " C04");
        System.out.println(str2);

        str2.replace(6, 9, "600");
        System.out.println(str2);

        str2.delete(6, 10);
        System.out.println(str2);

    }
}