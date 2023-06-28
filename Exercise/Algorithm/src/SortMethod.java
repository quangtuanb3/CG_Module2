
import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2, 3, 4, 5};
        selectSort(nums);
        System.out.println(Arrays.toString(nums));
        int a = 1;
        int b = 4;

//        bubbleSort(nums);
//        System.out.println(Arrays.toString(nums));


    }

    public static void bubbleSort(int[] nums) {
        for (int n = 0; n < nums.length - 1; n++) {
            for (int i = 0; i < nums.length - n - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                }

            }
        }
    }

    public static void swap(int[] nums, int i, int n) {
        int temp = nums[i];
        nums[i] = nums[n];
        nums[n] = temp;
    }

    public static int findMin(int index, int[] nums) {
        int min = index;
        for (int i = index + 1; i < nums.length; i++) {
            if (nums[i] < nums[min]) {
                min = i;
            }
        }
        return min;
    }

    public static void selectSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int index = findMin(i, nums);
            swap(nums, index, i);
        }
    }

}
