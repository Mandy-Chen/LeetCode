import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O11MinArrayTest {
    @Test
    void name() {
        int[] input={3,4,5,1,2};
        O11MinArray o11MinArray=new O11MinArray();
        int result=o11MinArray.minArray(input);
        assertEquals(result,1);
    }
}
