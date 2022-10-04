package LC_67_Add_Binary;

public class MainApp {

    public static void main(String[] args) {

        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));

        a = "1010";
        b = "1011";
        System.out.println(addBinary(a, b));

    }

    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            // Subtract by '0' to convert the numbers from a char type into an int
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';

            carry = sum > 1 ? 1 : 0;
            result.append(sum % 2);
        }
        if(carry != 0) result.append(carry); // we gonna add it into res until carry becomes 0;
        return result.reverse().toString();
    }
}
