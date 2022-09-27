package LC_35_Search_Insert_Position;

public class MainApp {
    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 6};
        int k = searchInsert(nums, 7);

        System.out.println("k = " + k);

    }

    public static int searchInsert(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (nums[middle] > target) {
                right = middle - 1;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                return middle;
            }
        }

        return left;
    }
}
