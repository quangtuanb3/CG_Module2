import java.util.Arrays;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        String s = "abckjhcbabcdadfasdbbccaaa";
        String[] string = s.split("");

        String[][] temp = new String[string.length][string.length];
        for (int i = 0; i < string.length; i++) {
            for (int j = i + 1 - 1; j < string.length; j++) {
                if (!Arrays.toString(temp[i]).contains(string[j])) {
                    temp[i][j] = string[j];

                } else break;
            }
        }
        String[][] result = removeNull(temp);
        int rowIndex = getLongestRow(result);

        System.out.println("Input string: \t"+ s);
        System.out.println("After filter: \t"+ Arrays.deepToString(result));
        System.out.println("Longest substring: \t" +Arrays.toString(result[rowIndex]));
        System.out.println(result[rowIndex].length);
    }

    static int getLongestRow(String[][] arr) {
        int longestRow = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[longestRow].length < arr[i].length) {
                longestRow = i;
            }
        }
        return longestRow;
    }

    static String[][] removeNull(String[][] arr) {
        String[][] result = new String[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            result[i] = Arrays.stream(arr[i])
                    .filter(Objects::nonNull)
                    .toArray(String[]::new);
        }
        return result;
    }
}