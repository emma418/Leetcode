import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int[] nums = {3,3};
        int target = 6;
        //long start = System.currentTimeMillis();
        int[] result = twoSum(nums, target);
//        long end = System.currentTimeMillis();
//        System.out.println(start - end);
        System.out.println(Arrays.toString(result));
    }
    public static int[] twoSum(int[] nums, int target) {
        //int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            if (map.containsKey(target - nums[i])) {
                int[] result = {map.get(target - nums[i]), i};
//                result[0] = map.get(target - nums[i]);
//                result[1] = i;
                return result;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}