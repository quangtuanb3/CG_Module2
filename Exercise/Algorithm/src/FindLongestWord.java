import java.util.ArrayList;

public class FindLongestWord {
    public static void main(String[] args) {
        String str = "abcabcdabcdeaiklmnp";
        System.out.println("Input str: " + str);
        String result = findLongestWord(str);
        System.out.println("1: " + result);


        String result1 = findLongestWord2(str);
        System.out.println("2: " + result1);
    }

    public static String findLongestWord(String str) {
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        for (int i = 1, j = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > result.charAt(j)) {
                result.append(str.charAt(i));
                j++;
            }
        }
        return result.toString();
    }

    public static String findLongestWord2(String str) {
        ArrayList<Integer> index = new ArrayList<>();
        index.add(0);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i + 1)) {
                index.add(i);
            }
        }
        index.add(str.length() - 1);
        int max = index.get(1) - index.get(0);
        StringBuilder result1 = new StringBuilder();
        for (int i = 1; i < index.size() - 1; i++) {
            if (max < (index.get(i + 1) - index.get(i))) {
                max = (index.get(i + 1) - index.get(i));
                result1.delete(0, result1.length());
                result1.append(str, index.get(i) + 1, index.get(i + 1) + 1);
            }
        }
        System.out.println(index);
        return result1.toString();
    }
}
