import java.util.HashMap;
import java.util.Map;

public class L136SingleNumber {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> map=new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
               map.remove(nums[i]);
            }else {
                map.put(nums[i],1);
            }
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            return entry.getKey();
        }
        return 0;

    }
}
