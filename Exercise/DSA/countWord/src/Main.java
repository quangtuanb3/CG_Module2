import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        String string = "abc ab abc ab ac add ade ead ab abc ab";
        TreeMap<String, Integer> result = addToMap(string);
        System.out.println(result);
    }

    public static TreeMap<String, Integer> addToMap(String string) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        String[] words = string.split(" ");
        for (String word : words) {
            String key = word.toLowerCase();
            if (treeMap.containsKey(key)) {
                Integer num = treeMap.get(key);
                treeMap.put(key, ++num);
            } else {
                treeMap.put(key, 1);
            }
        }
        return treeMap;

    }


}