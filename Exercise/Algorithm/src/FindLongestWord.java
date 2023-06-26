public class FindLongestWord {
    public static void main(String[] args) {
        String str = "abcdvghz";
        String result = findLongestWord(str);
        System.out.println(result);
    }

    public static String findLongestWord(String str) {
        StringBuilder result = new StringBuilder();
        result.append(str.charAt(0));
        for (int i = 1; i < str.length() - 1; i++) {
            if (str.charAt(i) > str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }
}
