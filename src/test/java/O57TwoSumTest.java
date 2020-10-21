import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class O57TwoSumTest {
    @Test
    void name() {
        int[] nums={2,7,11,15};
        int target=9;
        O57TwoSum o57TwoSum=new O57TwoSum();
        int[] result=o57TwoSum.twoSum(nums,target);
        assertArrayEquals(result,new int[] {7,2});
    }
    @Test
    void test() {
        int[] nums={10,26,30,31,47,60};
        int target=40;
        O57TwoSum o57TwoSum=new O57TwoSum();
        int[] result=o57TwoSum.twoSum(nums,target);
        assertArrayEquals(result,new int[] {30,10});
    }
}
