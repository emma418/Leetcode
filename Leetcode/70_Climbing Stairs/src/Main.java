// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }
    public static int climbStairs(int n) {
        int[] ways = new int[n+1];
        if (n == 1) return 1;
        ways[0] = 0;
        ways[1] = 1;
        for( int i = 3; i <= n; i++) {
            ways[i] = ways[i-1] + ways[i - 2];
        }
        return ways[n];
    }
}