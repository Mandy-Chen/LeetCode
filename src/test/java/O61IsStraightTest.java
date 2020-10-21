import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class O61IsStraightTest {
    @Test
    void name() {
        int[] input={1,2,3,4,5};
        O61IsStraight o61IsStraight=new O61IsStraight();
        Boolean result=o61IsStraight.isStraight(input);
        assertTrue(result);
    }
    @Test
    void test() {
        int[] input={0,0,1,2,5};
        O61IsStraight o61IsStraight=new O61IsStraight();
        Boolean result=o61IsStraight.isStraight(input);
        assertTrue(result);
    }
    @Test
    void test1() {
        int[] input={0,0,1,2,7};
        O61IsStraight o61IsStraight=new O61IsStraight();
        Boolean result=o61IsStraight.isStraight(input);
        assertFalse(result);
    }
    @Test
    void test2() {
        int[] input={1,0,3,0,5};
        O61IsStraight o61IsStraight=new O61IsStraight();
        Boolean result=o61IsStraight.isStraight(input);
        assertTrue(result);
    }
    @Test
    void test3() {
        int[] input={1,0,0,0,5};
        O61IsStraight o61IsStraight=new O61IsStraight();
        Boolean result=o61IsStraight.isStraight(input);
        assertTrue(result);
    }
    @Test
    void test4() {
        int[] input={0,0,2,2,5};
        O61IsStraight o61IsStraight=new O61IsStraight();
        Boolean result=o61IsStraight.isStraight(input);
        assertFalse(result);
    }
}
