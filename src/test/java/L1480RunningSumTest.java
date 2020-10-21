import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L1480RunningSumTest {
    @Test
    void name() {
        int[] input={1,2,3,4};
        L1480RunningSum l1480RunningSum=new L1480RunningSum();
        int[] result=l1480RunningSum.runningSum(input);
        assertArrayEquals(result,new int[] {1,3,6,10});
    }
    @Test
    void name1() {
        int[] input={1,1,1,1,1};
        L1480RunningSum l1480RunningSum=new L1480RunningSum();
        int[] result=l1480RunningSum.runningSum(input);
        assertArrayEquals(result,new int[] {1,2,3,4,5});
    }
    @Test
    void name2() {
        int[] input={3,1,2,10,1};
        L1480RunningSum l1480RunningSum=new L1480RunningSum();
        int[] result=l1480RunningSum.runningSum(input);
        assertArrayEquals(result,new int[] {3,4,6,16,17});
    }
}
