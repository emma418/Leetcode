import java.util.Arrays;

import static java.lang.Math.floor;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,2,2,2,3,4};
        System.out.println(removeElement(nums, 2));
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }


    }
    public static int removeElement(int[] nums, int val) {
       int j = 0;
       int temp;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return j;
    }
}