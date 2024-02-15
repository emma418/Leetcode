// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int x = 100;
        System.out.println(mySqrt(x));
    }
    public static int mySqrt(int x) {
        if(x <= 1) return x;
        long start = 0;
        long end = x / 2;


        while(start <= end) {
            long mid = (start + end) / 2;
            if ((mid * mid) == x){
                return (int) mid;
            } else if ((mid * mid < x)) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }
        return (int)end;
    }
}