import java.util.Arrays;

public class L1470Shuffle {
    public int[] shuffle(int[] nums, int n) {
        int[] A = new int[n];
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = nums[i];
            B[i] = nums[i + n];
        }
        for (int i = 0, a = 0, b = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = A[a];
                a++;
            } else {
                nums[i] = B[b];
                b++;
            }
        }
        return nums;

    }
}
