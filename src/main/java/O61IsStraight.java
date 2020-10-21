import java.util.Arrays;

public class O61IsStraight {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        Boolean result = false;
        int count=0;
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i]==0){
                count++;
                continue;
            }
            int sub=nums[i + 1] - nums[i];
            if(sub>4){
                return false;
            }
            switch(sub)
            {
                case 0 :
                    return false;
                case 1 :
                    result = true;
                    break;
                case 2 :
                    count--;
                    result = true;
                    break;
                case 3:
                    count=count-2;
                    result = true;
                    break;
                case 4 :
                    count=count-3;
                    result = true;
                    break;
            }
            if(count<0){
                return false;
            }
        }
        return result;

    }
}
