public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 7, 8, 9, 11, 12, 21, 22};
        int result = binarySearch(nums, 0, nums.length - 1, 3);
        System.out.println(result);
    }

    public static int binarySearch(int[] arr, int left, int right, int value) {
        if (left > right) {
            return -1;
        }

        int mid = (left + right) / 2;
        if (arr[mid] == value) {
            return mid;
        } else if (arr[mid] > value) {
            return binarySearch(arr, left, --mid, value);
        } else if (arr[mid] < value) {
            return binarySearch(arr, ++mid, right, value);
        }

        return mid;
    }

}
