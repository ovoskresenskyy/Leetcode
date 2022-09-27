package LC_26_Remove_Duplicates_from_Sorted_Array;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int k = removeDuplicates(nums);

    }

    private static int removeDuplicates(int[] nums) {
        int slowPointer = 0;
        for (int fastPointer = 1; fastPointer < nums.length; fastPointer++) {
            if (nums[slowPointer] != nums[fastPointer]) {
                slowPointer++;
                nums[slowPointer] = nums[fastPointer];
            }
        }
        return slowPointer + 1;
    }}
