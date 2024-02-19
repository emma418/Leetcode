// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().trim();
        int i = 0;
        int j = s.length() -1;
        while(i <= j) {
            char x = s.charAt(i);
            char y = s.charAt(j);
            if (!(x >= 'a' && x <= 'z' || x >= '0' && x <= '9')) {
                i++;
                continue;
            }
            if (!(y >= 'a' && y <= 'z' || y >= '0' && y <= '9')) {
                j--;
                continue;
            }
            if (x != y) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}