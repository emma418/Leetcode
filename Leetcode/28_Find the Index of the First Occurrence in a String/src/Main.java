// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String haystack = "abcd";
        String needle = "d";
        System.out.println(strStr(haystack, needle));
        

    }
    public static int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) return -1;
        if (haystack.equals(needle)) return 0;
        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            if(haystack.substring(i, i+needle.length()).equals(needle)) {
                return i;
            }

        }
        return -1;
    }
}