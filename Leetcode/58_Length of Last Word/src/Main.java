// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String s = "Hello World   ";
        System.out.println(lengthOfLastWord(s));

    }
    public static int lengthOfLastWord(String s) {
        //solution 1 (1 ms)
//        String[] str = s.split(" ");
//        return str[str.length - 1].length();

        //solution 2 without using split()
//        s = s.trim();
//        for (int i = s.length() - 1; i >= 0; i--) {
//            if(s.charAt(i) == ' ') {
//                return s.length()-1-i;
//            }
//        }
//        return s.length();

        //solution 3 without using trim()
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                len++;
            }
            if (len > 0 && s.charAt(i) == ' '){
                return len;
            }
        }
        return len;
    }
}