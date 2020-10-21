import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class L645FindErrorNums {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        Set set = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                result[0] = nums[i];
            } else {
                set.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(!set.contains(i+1)){
                result[1] = i+1;
                break;
            }
        }
        return result;
    }
}
