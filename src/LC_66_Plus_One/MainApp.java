package LC_66_Plus_One;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {
        int[] digits = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[] {4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[] {9};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[] {7, 8, 9};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[] {7, 8, 9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));

        digits = new int[] {5, 6, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits)));

    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            } else {
                digits[i] = 0;
            }
        }

        if (digits[0] == 0) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            return res;
        }
        return digits;
    }

}
