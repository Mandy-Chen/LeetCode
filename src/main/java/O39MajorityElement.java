import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class O39MajorityElement {
    public int majorityElement(int[] nums) {
        int result = 0;
        int count=0;
        Map map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                count= (int) map.get(nums[i])+1;
                map.put(nums[i], count);
            } else {
                map.put(nums[i], 1);
            }
        }
        for(Object key : map.keySet()){
            int value = (int) map.get(key);
            if(value>nums.length/2){
                result= (int) key;
                break;
            }
        }
        return result;
    }
}
