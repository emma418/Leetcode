import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        Integer[] values = {1, 5, 10, 50, 100, 500, 1000};
        Character[] keys = {'I', 'V', 'X', 'L', 'C', 'D', 'M'};

        for(int i = 0; i < keys.length; i++){
            map.put(keys[i], values[i]);
        }
        int result = 0;
        int value = 0;
        int prev = 0;
        for (int i = 0; i < s.length(); i++) {
            value = map.get(s.charAt(i));
            if (value <= prev) {
                result += value;
            } else {
                result = result + value - 2 * prev;
            }
            prev = value;
        }
        return result;
    }
    public static int romanToInt2(String s) {
        int result = 0;
        int number = 0;
        int prev = 0;
        for(int i = 0; i < s.length(); i++) {
            switch(s.charAt(i)){
                case 'M':
                    number = 1000;
                    break;
                case 'D':
                    number = 500;
                    break;
                case 'C':
                    number = 100;
                    break;
                case 'L':
                    number = 50;
                    break;
                case 'X':
                    number = 10;
                    break;
                case 'V':
                    number = 5;
                    break;
                case 'I':
                    number = 1;
                    break;
            }

            if (number <= prev) {
                result += number;
            } else {
                result = result + number - 2*prev;
            }
            prev = number;
        }
        return result;
    }
}