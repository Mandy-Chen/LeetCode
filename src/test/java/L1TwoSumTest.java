import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L1TwoSumTest {
    @Test
    void test1() {
        int[] nums = {2, 7, 11, 15};
        int target=9;
        L1TwoSum l1TwoSum=new L1TwoSum();
        int[] result=l1TwoSum.twoSum(nums,target);
        assertArrayEquals(result,new int[] {0,1});
    }
    @Test
    void test2() {
        int[] nums = {3,2,4};
        int target=6;
        L1TwoSum l1TwoSum=new L1TwoSum();
        int[] result=l1TwoSum.twoSum(nums,target);
        assertArrayEquals(result,new int[] {1,2});
    }
}
