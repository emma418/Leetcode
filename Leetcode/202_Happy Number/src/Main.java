import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(isHappy(n));
    }
    public static boolean isHappy(int n) {
        if (n == 1) return true;
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        while (n > 0) {
            int digit = n % 10;
            sum = sum + digit * digit;
            n = n / 10;
            if (n == 0) {
                if (sum == 1) return true;
                if (set.contains(sum)) return false;
                n = sum;
                set.add(sum);
                sum = 0;
            }
        }
        return false;
    }
}