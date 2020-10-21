import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class O3FindRepeatNumberTest {
    @Test
    void name() {
        int[] nums={2, 3, 1, 0, 2, 5, 3};
        O3FindRepeatNumber o3FindRepeatNumber=new O3FindRepeatNumber();
        int result=o3FindRepeatNumber.findRepeatNumber(nums);
        assertTrue(result==2||result==3);
    }
    @Test
    void test() {
        int[] nums={0, 1, 2, 3, 4, 11, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        O3FindRepeatNumber o3FindRepeatNumber=new O3FindRepeatNumber();
        int result=o3FindRepeatNumber.findRepeatNumber(nums);
        assertEquals(result,11);
    }
    @Test
    void test1() {
        int[] nums={14, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
        O3FindRepeatNumber o3FindRepeatNumber=new O3FindRepeatNumber();
        int result=o3FindRepeatNumber.findRepeatNumber(nums);
        assertEquals(result,14);
    }
}
