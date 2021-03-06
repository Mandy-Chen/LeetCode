import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class L15ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        if (nums.length > 2) {
            for (int i = 0; i < nums.length-2; i++) {
                if(nums[i]>0) break;
                if(i>0&&nums[i]==nums[i-1]) continue;
                int l = i + 1;
                int r = nums.length - 1;
                while (l < r) {
                    int sum = nums[i] + nums[l] + nums[r];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[l], nums[r]));
                        while (l<r&&nums[l]==nums[l+1]) l++;
                        while (l<r&&nums[r]==nums[r-1]) r--;
                        l++;
                        r--;
                    } else if (sum > 0) {
                        r--;
                    } else {
                        l++;
                    }

                }
            }
        }
        return result;
    }
}
