public class O53MissingNumber {
    public int missingNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                result = i;
                break;
            }
            if(nums.length==1||i==nums.length-1){
                result = i+1;
                break;
            }
        }
        return result;
    }
}
