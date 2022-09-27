package LC_27_Remove_Elements;

public class MainApp {

    public static void main(String[] args) {

        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};

        int k = removeElements(nums, 2);

    }

    private static int removeElements(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i++] = nums[j];
            }
        }
        return i;
    }
}
