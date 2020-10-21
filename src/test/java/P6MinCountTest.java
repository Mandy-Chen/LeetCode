import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P6MinCountTest {
    @Test
    void name() {
        int[] coins = {4, 2, 1};
        P6MinCount p6MinCount = new P6MinCount();
        int result = p6MinCount.minCount(coins);
        assertEquals(result, 4);
    }
    @Test
    void test() {
        int[] coins = {2,3,10};
        P6MinCount p6MinCount = new P6MinCount();
        int result = p6MinCount.minCount(coins);
        assertEquals(result, 8);
    }
}

