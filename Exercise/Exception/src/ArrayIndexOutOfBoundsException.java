public class ArrayIndexOutOfBoundsException extends Throwable {
    public static void main(String[] args) {
        int[] nums = createNumbers(100);
    try {
        System.out.println(nums[100]);
    } catch (IndexOutOfBoundsException e) {
        System.out.println("Loi tai Tuan Em " + e.getMessage() );
    }


    }
    public static int[] createNumbers(int size) {
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = (int) Math.floor(Math.random() * 100 + 1);
        }
        return nums;
    }

}
