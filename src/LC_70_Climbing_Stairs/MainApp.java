package LC_70_Climbing_Stairs;

public class MainApp {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairs(4));
        System.out.println(climbStairs(10));
        System.out.println(climbStairs(20));
    }

    public static int climbStairs(int n) {
        int a = 1, b = 1;
        for (int i = 0; i < n; i++) {
            a = (b += a) - a;
        }
        return a;
    }
}
