

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));

    }
    public static String addBinary(String a, String b) {

        //solution 3 with StringBuilder
        int indexA = a.length() -1;
        int indexB = b.length() - 1;
        StringBuilder result = new StringBuilder();

        int carry = 0;

        while(indexA >= 0 || indexB >= 0) {
            int digitA = indexA >= 0 ? a.charAt(indexA) - '0' : 0;
            int digitB = indexB >= 0 ? b.charAt(indexB) - '0' : 0;
            int sum = (digitA + digitB + carry) % 2;
            result.insert(0, sum);
            carry = sum / 2;
            indexA--;
            indexB--;
        }
        if (carry == 1) {
            return result.insert(0, carry).toString();
        }

        return result.toString();


        // solution 2
//        int indexA = a.length() -1;
//        int indexB = b.length() - 1;
//
//        int carry = 0;
//        String newDigit = "";
//        String newString = "";
//        while(indexA >= 0 || indexB >= 0) {
//            int digitA = indexA >= 0 ? a.charAt(indexA) - '0' : 0;
//            int digitB = indexB >= 0 ? b.charAt(indexB) - '0' : 0;
//            newDigit = String.valueOf((digitA + digitB + carry) % 2);
//            carry = (digitA + digitB + carry) / 2;
//            newString = newDigit + newString;
//            indexA--;
//            indexB--;
//        }
//        if (carry == 1) {
//            return newString = String.valueOf(carry) + newString;
//        }
//
//        return newString;

        //solution 1
//        int len = a.length() >= b.length() ? a.length() : b.length();
//        String align = "";
//        if (len == a.length()) {
//            for (int i = 0; i < len - b.length(); i++) {
//               align = "0"  + align;
//            }
//            b = align + b;
//        } else {
//            for (int i = 0; i < len - a.length(); i++) {
//                align = "0"  + align;
//            }
//            a = align + a;
//        }
//
//        String  carry = "0";
//        String newString = "";
//        String s = "";
//        for (int i = len - 1; i >= 0; i--) {
//            if(a.charAt(i) == '1' && b.charAt(i) == '1') {
//                if (carry.equals("0")) {
//                    s = "0";
//                }else {
//                    s = "1";
//                }
//                carry = "1";
//            } else if (a.charAt(i) == '1' && b.charAt(i) == '0' || a.charAt(i) == '0' && b.charAt(i) == '1') {
//                if (carry.equals("0")) {
//                    s = "1";
//                }else {
//                    s = "0";
//                    carry = "1";
//                }
//            }else {
//                if (carry.equals("0")) {
//                    s = "0";
//                }else {
//                    s = "1";
//                    carry = "0";
//                }
//            }
//            newString = s + newString;
//        }
//        if (carry.equals("1")) return carry + newString;
//        else return newString;

    }
}