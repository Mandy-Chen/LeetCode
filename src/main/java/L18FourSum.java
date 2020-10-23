import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L18FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> result=new ArrayList<>();
        if(nums.length>3) {
            for (int i = 0; i < nums.length-3; i++) {
                if(i>0&&nums[i]==nums[i-1]) continue;
                for (int j = i + 1; j < nums.length-2; j++) {
                    if(j>(i+1)&&nums[j]==nums[j-1]) continue;
                    int l = j+1;
                    int r = nums.length - 1;
                    while (l < r) {
                        int sum = nums[i] + nums[j] + nums[l] + nums[r];
                        if (sum == target) {
                            List<Integer> list=new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[l]);
                            list.add(nums[r]);
                            result.add(list);
                            while (l < r && nums[l] == nums[l + 1]) l++;
                            while (l < r && nums[r] == nums[r - 1]) r--;
                            l++;
                            r--;
                        } else if (sum > target) {
                            r--;
                        } else {
                            l++;
                        }
                    }

                }
            }
        }
        return result;
    }
}
