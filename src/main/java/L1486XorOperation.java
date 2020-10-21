public class L1486XorOperation {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
            result ^= nums[i];
        }
        return result;
    }
}
