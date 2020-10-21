import java.util.*;

public class O57TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        Map map=new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])){
                result[0]=nums[i];
                result[1]=target-nums[i];
                break;
            }else {
                map.put(nums[i],nums[i]);
            }
        }
        return result;
    }
}
