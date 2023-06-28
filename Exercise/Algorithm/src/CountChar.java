import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountChar {
    public static void main(String[] args) {
        String str = "aaaabbcccccddddee";
        HashMap<Character, Integer> result = countChar(str);
        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            Character key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ": " + value);
        }
        System.out.println("end");
    }
    public static HashMap<Character, Integer> countChar(String str) {
        HashMap<Character, Integer> result = new HashMap<>();
        miniCount(str, result);
        return result;
    }
    public static void miniCount(String str, HashMap<Character, Integer> result) {
        int left = 0;
        int right = str.length() - 1;
        int mid = (left + right) / 2;
        char current = str.charAt(0);
        while (str.charAt(left) != str.charAt(right)) {
            if (current < str.charAt(mid)) {
                right = mid - 1;
                mid = (left + right) / 2;
            } else if (current > str.charAt(mid)) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else if (current == str.charAt(mid)) {
                if (current != str.charAt(mid + 1)) {
                    result.put(current, (mid - left + 1));
                    str = str.replace(String.valueOf(current), "");
                    miniCount(str, result);
                } else {
                    left = mid + 1;
                    mid = (left + right) / 2;
                }

            }
        }
        if (str.charAt(left) == str.charAt(right)) {
            result.put(current, right + 1);
            str = str.replace(String.valueOf(current), "");

            if (!str.equals("")) {
                miniCount(str, result);
            }
        }
    }
}
