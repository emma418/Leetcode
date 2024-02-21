import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";
        System.out.println(wordPattern(pattern, s));

    }
    public static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] strs = s.split(" ");
        if (pattern.length() != strs.length) return false;

        for (int i = 0; i < pattern.length(); i++) {
            char key = pattern.charAt(i);
            if (!map.containsKey(key)) {
                if (map.containsValue(strs[i])) return false;
                map.put(key, strs[i]);
            }else
                if (!map.get(key).equals(strs[i])) return false;
        }
        return true;
    }
}