import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class O21Exchange {
    public int[] exchange(int[] nums) {
        List oddList = new ArrayList();
        List evenList = new ArrayList();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenList.add(nums[i]);
            } else {
                oddList.add(nums[i]);
            }
        }
        for (int i = 0; i < oddList.size(); i++) {
            nums[i]= (int) oddList.get(i);
        }
        for (int i = 0; i < evenList.size(); i++) {
            nums[i+oddList.size()]= (int) evenList.get(i);
        }
        return nums;
    }
}
