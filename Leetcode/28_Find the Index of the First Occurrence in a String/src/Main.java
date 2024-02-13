// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        String haystack = "mississippi";
        String needle = "pi";
        System.out.println(strStr(haystack, needle));

    }
    public static int strStr(String haystack, String needle) {
        int index = -1;
        int sub = 0;
        while(haystack.contains(needle)){
            sub = sub + index + 1;
            index = haystack.indexOf(needle.charAt(0));
            if (haystack.substring(index, index+needle.length()).equals(needle)) {
                return index + sub;
            } else {
                haystack = haystack.substring(index + 1);
                continue;
            }
        }
        return index;

    }
}