// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s = "abc";
        String t = "abc";
        System.out.println(isSubsequence(s, t));
    }
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0 && t.length() != 0) return false;
        if (s.length() != 0 && t.length() == 0) return false;
        if (s.length() == 0 && t.length() == 0) return true;

        int x = 0;
        int y = s.length() - 1;

        int i = 0;
        int j = t.length() - 1;

        while(i <= j) {
            if (x == y && s.charAt(x) == t.charAt(j)) return true;
            if(s.charAt(x) == t.charAt(i)) {
                x++;
            }
            if(s.charAt(y) == t.charAt(j)) {
                y--;
            }
            if(x>y && i != j){
                return true;
            }
            i++;
            j--;
        }
        return false;
    }
}