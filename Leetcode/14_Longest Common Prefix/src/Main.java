import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String[] strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
    public static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int index = 0;
        for (int i = 0; i < first.length(); i++) {
            if (i >= last.length() || last.charAt(i) != first.charAt(i)){
                return first.substring(0,index);
            } else {
                index++;
            }
        }
        return first.substring(0,index);

    }
}