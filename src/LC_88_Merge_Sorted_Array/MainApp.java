package LC_88_Merge_Sorted_Array;

public class MainApp {
    public static void main(String[] args) {

        merge(new int[]{1}, 1, new int[0], 0);

    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = nums1.length - 1, a = m - 1, b = n - 1; b >= 0; i--) {
            if (a >= 0 && nums1[a] > nums2[b]) nums1[i] = nums1[a--];
            else nums1[i] = nums2[b--];
        }
    }
}
