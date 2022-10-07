package LC_69_SqrtX;

public class MainApp {
    public static void main(String[] args) {

        System.out.println(mySqrt(15));

    }

    public static int mySqrt(int x) {

        if (x == 0) return x;

        int start = 1;
        int end = x;
        int result = 0;

        while (start <= end) {
            //Use binary search
            int mid = start + (end - start) / 2;

            if (mid <= x / mid) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
}
