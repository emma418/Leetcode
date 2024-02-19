import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       String  s = "badc";
       String t = "baba";

        System.out.println(isIsomorphic(s, t));

    }
    public static boolean isIsomorphic(String s, String t) {
        //solution 2 (6ms)
        if(s.length() != t.length()) return false;
        int[] record1 = new int[256];
        int[] record2 = new int[256];

        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if ((record1[ch1] != 0 && record1[ch1] != ch2)
            || (record2[ch2] != 0 && record2[ch2] != ch1)) {
                return false;
            }
            record1[ch1] = ch2;
            record2[ch2] = ch1;

        }
        return true;
        
        
        //solution 1(22 ms)
//        if(s.length() != t.length()) return false;
//        HashMap<Character, Character> map1 = new HashMap<>();
//        HashMap<Character, Character> map2 = new HashMap<>();
//
//        for (int i = 0; i < s.length(); i++) {
//            if(!map1.containsKey(s.charAt(i))) {
//                map1.put(s.charAt(i), t.charAt(i));
//            }
//            if(!map2.containsKey(t.charAt(i))) {
//                map2.put(t.charAt(i), s.charAt(i));
//            }
//            if (map1.get(s.charAt(i)) != t.charAt(i) || map2.get(t.charAt(i)) != s.charAt(i)) {
//                return false;
//            }
//        }
//        return true;
    }
}