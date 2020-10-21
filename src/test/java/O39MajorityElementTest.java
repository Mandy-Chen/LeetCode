import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O39MajorityElementTest {
    @Test
    void name() {
        int[] input={1, 2, 3, 2, 2, 2, 5, 4, 2};
        O39MajorityElement o39MajorityElement=new O39MajorityElement();
        int result=o39MajorityElement.majorityElement(input);
        assertEquals(result,2);
    }
    @Test
    void test() {
        int[] input={-1,1,1,1,2,1};
        O39MajorityElement o39MajorityElement=new O39MajorityElement();
        int result=o39MajorityElement.majorityElement(input);
        assertEquals(result,1);
    }
}
