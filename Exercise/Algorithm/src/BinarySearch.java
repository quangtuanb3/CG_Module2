public class BinarySearch {
    public static void main(String[] args) {
            int[] nums = {1,2,4,5,6,10,22,23,27,33,88};
            int index = getIndexOf(nums, 33);
        System.out.println(index);
    }

    public static int getIndexOf(int[] numbers, int num) {
        int left = 0;
        int right = numbers.length - 1;
        int mid = (left + right) / 2;
        while (!(left == right)) {
            if (num == numbers[mid]) {
                return mid;
            }
            if (num > numbers[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
            mid = (left + right) / 2;

        }
        return -1;
    }
}