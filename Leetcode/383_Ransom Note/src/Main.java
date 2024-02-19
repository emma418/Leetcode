import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String ransomNote = "ab";
        String magazine = "ba";
        System.out.println(canConstruct(ransomNote, magazine));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        int[] record = new int[26];
        if(ransomNote.length() > magazine.length()) return false;

        for (int i = 0; i < magazine.length(); i++) {
            record[magazine.charAt(i) - 97]++;
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            record[c - 97]--;
            if(record[c - 97] < 0) {
                return false;
            }
        }
        return true;
    }
}