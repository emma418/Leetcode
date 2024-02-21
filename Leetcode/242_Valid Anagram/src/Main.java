// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s = "a";
        String t = "b";

        System.out.println(isAnagram(s, t));

    }
    public static boolean isAnagram(String s, String t) {
        //solution 1
        if(s.length() != t.length()) return false;
        int[] record = new int[26];

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        for (int i = 0; i < sChar.length; i++) {
            record[sChar[i] - 97]++;
            record[tChar[i] - 97]--;
        }
        for (int i = 0; i < record.length; i++) {
            if(record[i] != 0) return false;
        }
        return true;

        //Solution 2
//        if(s.length() != t.length()) return false;
//        int[] record = new int[26];

//        for (int i = 0; i < s.length(); i++) {
//            char ch1 = s.charAt(i);
//            char ch2 = t.charAt(i);
//            record[ch1- 97]++;
//            record[ch2 - 97]--;
//        }
//        for (int i = 0; i < record.length; i++) {
//            if(record[i] != 0) return false;
//        }
//        return true;
    }
}