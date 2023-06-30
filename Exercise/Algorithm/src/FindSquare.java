import java.util.ArrayList;
import java.util.Arrays;

public class FindSquare {
    public static void main(String[] args) {
        String str = "{[()]}))";
        System.out.println(areBracketsBalanced(str));
//        int num = 26;
//        int square = getSquare(num);
//        System.out.println(square);
//
//        int[] nums = {7,3,2,9,22,11,2,6};
//        insertionSort(nums);
//        System.out.println(Arrays.toString(nums));
//        int[] nums2 ={2,3,5,6,7,8,11,23,26};
//
//        System.out.println("binary search: " + binarySearch(nums2,23));
        String abc ="aaaabbbcccddaa";
        System.out.println(encodeString(abc));
    }

    public static boolean areBracketsBalanced(String str) {

        String[] arr = str.split("");
        int size = arr.length - 1;
        if (arr.length % 2 != 0) {
            return false;
        }
        for (int i = 0; i < arr.length / 2; i++) {
            if (getValueOf(arr[i]) != getValueOf(arr[size - i]) - 1)
                return false;
        }
        return true;
    }

    public static void insertionSort(int[] arr) {
        //Your code here
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    i = j;
                }
            }
        }
    }

    public static int getSquare(int num) {
        if (num == 1) return 1;
        int left = 2;
        int right = num / 2;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (mid * mid > num) {
                right = mid - 1;
                mid = (left + right) / 2;
            } else if (mid * mid < num) {
                left = mid + 1;
                mid = (left + right) / 2;
            } else {
                return mid;
            }
        }
        if (mid * mid != num) {
            return -1;
        }
        return mid;
    }

    public static int binarySearch(int[] arr, int key) {
        //Your code here
        int left = 0;
        int right = arr.length - 1;
        int result = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (key < arr[mid]) {
                right = mid - 1;
            } else if (key > arr[mid]) {
                left = mid + 1;
            } else {
                result = mid;
                return result;
            }
        }
        return result;

    }

    public static int getValueOf(String str) {
        int value = -1;
        switch (str) {
            case "(":
                value = 1;
                break;
            case ")":
                value = 2;
                break;
            case "[":
                value = 11;
                break;
            case "]":
                value = 12;
                break;
            case "{":
                value = 21;
                break;
            case "}":
                value = 22;
                break;
        }
        return value;
    }
    public static String encodeString(String str) {
        String[] arr = str.split("");
        ArrayList<Integer> index = new ArrayList<>();
        index.add(0);
        for(int i = 0; i < str.length()-1;i++ ){
            if(!arr[i].equals(arr[i+1])){
                index.add(i);
            }
        }
        index.add(arr.length -1);
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < index.size(); i++){
            result.append(arr[i]).append((i + 1) + 1);
            i++;
        }
        return result.toString();
    }
}
