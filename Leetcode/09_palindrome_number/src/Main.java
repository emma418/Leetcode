// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
    public static boolean isPalindrome(int x) {
        int n = 0;
        int sum = 0;
        int y = x;
        while(y != 0) {
            int reminder = y % 10;
            sum = sum * 10 + reminder;
            y = y / 10;
            n++;
        }
        if (sum == x && x > 0) {
            return true;
        } else {
            return false;
        }
    }
}