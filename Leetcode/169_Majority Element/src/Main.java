import java.util.Collections;
import java.util.HashMap;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,2,3,4,3, 3, 3,7,3,5,9, 3};
        System.out.println(majorityElement(nums));
    }
    public static int majorityElement(int[] nums) {
        int current = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
           count = current == nums[i] ? ++count : --count;
           if (count == -1) {
               current = nums[i];
               count = 1;
           }
        }
        return current;
    }
}