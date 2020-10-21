import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class O21ExchangeTest {
    @Test
    void name() {
        int[] input={1,2,3,4};
        O21Exchange o21Exchange=new O21Exchange();
        int[] result=o21Exchange.exchange(input);
        assertArrayEquals(result,new int[] {1,3,2,4});
    }
}
