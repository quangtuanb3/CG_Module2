import java.util.Arrays;

public class FindNum {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 7, 8};
        System.out.println("run");
        int[] result = getRangeOfNum(nums,4);
        System.out.println(Arrays.toString(result));
    }
    public static int[] getRangeOfNum(int[] nums, int key) {
        int first =-1;
        int last = -1;
        int[] result = {-1,-1};

        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] < key) {
                left = mid + 1;
            } else if (nums[mid] > key) {
                right = mid - 1;
            } else  {
                first = mid;
                last = mid;
                while (nums[first] == nums[mid]) {
                    first--;
                }
                while (nums[last] == nums[mid]) {
                    last++;
                }
                result[0] = first+1;
                result[1] = last -1;
                return result;
            }

        }

        return result;
    }
}
