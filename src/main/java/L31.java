public class L31 {
    public void nextPermutation(int[] nums) {
        int t1 = 0;
        for (int l1 = nums.length - 2; l1 >=0; l1--) {
            for (int r1 = nums.length - 1; r1 >l1 ; r1--) {
                if (nums[r1] > nums[l1]) {
                    t1 = nums[l1];
                    nums[l1] = nums[r1];
                    nums[r1] = t1;
                    sortNums(l1 + 1, nums.length - 1, nums);
                    return;
                }
            }
        }
        sortNums(0, nums.length - 1, nums);
    }

    private void sortNums(int l, int r, int[] nums) {
        int t = 0;
        while (l < r) {
            t = nums[l];
            nums[l] = nums[r];
            nums[r] = t;
            l++;
            r--;
        }
    }
}
