import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {1, 6, 2, 7, 2, 11, 22, 15};
        int[] res = mergeSort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(res));
    }

    public static int[] mergeSort(int[] arr, int left, int right) {
        if (arr.length <= 1) {
            return arr;
        }
        int m = right / 2;

        int[] arrLeft = Arrays.copyOfRange(arr, left, m +1);
        int[] arrRight = Arrays.copyOfRange(arr, m +1 , right + 1);
        int[] arrayLeft = mergeSort(arrLeft, 0, arrLeft.length-1);
        int[] arrayRight = mergeSort(arrRight, 0, arrRight.length-1);

        return merge(arrayLeft, arrayRight);
    }
    public static int[] merge(int[] arrLeft, int[] arrRight) {
        ArrayList<Integer> result = new ArrayList<>();
        int l = 0;
        int r = 0;
        while (l < arrLeft.length && r < arrRight.length) {
            if (arrLeft[l] < arrRight[r]) {
                result.add(arrLeft[l]);
                l++;
            } else {
                result.add(arrRight[r]);
                r++;
            }
        }
        while (l < arrLeft.length) {
            result.add(arrLeft[l]);
            l++;
        }
        while (r < arrRight.length) {
            result.add(arrRight[r]);
            r++;
        }
        int[] res = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }

        return res;
    }
}
