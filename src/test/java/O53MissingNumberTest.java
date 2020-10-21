import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O53MissingNumberTest {
    @Test
    void name() {
        int[] nums={0,1,3};
        O53MissingNumber o53MissingNumber=new O53MissingNumber();
        int result=o53MissingNumber.missingNumber(nums);
        assertEquals(result,2);
    }
    @Test
    void test() {
        int[] nums={0};
        O53MissingNumber o53MissingNumber=new O53MissingNumber();
        int result=o53MissingNumber.missingNumber(nums);
        assertEquals(result,1);
    }
    @Test
    void test1() {
        int[] nums={0,1,2,3,4,5,6,7,9};
        O53MissingNumber o53MissingNumber=new O53MissingNumber();
        int result=o53MissingNumber.missingNumber(nums);
        assertEquals(result,8);
    }
    @Test
    void test3() {
        int[] nums={0,1};
        O53MissingNumber o53MissingNumber=new O53MissingNumber();
        int result=o53MissingNumber.missingNumber(nums);
        assertEquals(result,2);
    }
}
