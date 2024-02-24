import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,6,8,9};
        System.out.println(summaryRanges(nums));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 0) return result; // Handle empty array
        if (nums.length == 1) {
            result.add(String.valueOf(nums[0])); // Handle single-element array
            return result;
        }
        for (int i = 0; i < nums.length; i++){
            int start = nums[i];
            while(i < nums.length - 1 && nums[i+1] - nums[i] == 1) {
                i++;
            }
            if (start == nums[i]) result.add(nums[i] + "");
            else result.add(start + "->" + nums[i]);
        }
        return result;
    }
}