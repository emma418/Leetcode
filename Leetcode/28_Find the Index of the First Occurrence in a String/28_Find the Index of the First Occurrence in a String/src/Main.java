// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String haystack = "AABACAABABACAA";
        String needle = "ABABAC";
        System.out.println(strStr(haystack, needle));
//        for (int i = 0; i < getLps(needle).length; i++) {
//            System.out.print(getLps(needle)[i] + " ");
//
//        }


    }
    public static int strStr(String haystack, String needle) {
        //KMP solution
        //get the partial match table
        int[] lps = new int[needle.length()];
        lps[0] = 0;
        int i = 0;
        for (int j = 1; j < needle.length(); j++) {
            while (i > 0 && needle.charAt(i) != needle.charAt(j)) {
                i = lps[i - 1];

            }
            if (needle.charAt(i) == needle.charAt(j)) {
                lps[j] = ++i;

            } else {
                lps[j] = 0;
            }
        }
        int n = 0;
        for (int h = 0; h < haystack.length(); h++) {
            while( n > 0 && haystack.charAt(h) != needle.charAt(n)) {
                n = lps[n - 1];
            }
            if (haystack.charAt(h) == needle.charAt(n)) {
                n++;
            }
            if (n == needle.length()) {
                return h-n+1;
            }
        }
        return -1;
    }

}