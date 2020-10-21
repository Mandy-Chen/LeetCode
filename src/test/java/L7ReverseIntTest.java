import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L7ReverseIntTest {
    @Test
    void should_return_321_when_reverse_given_123() {
        int input=123;
        L7ReverseInt l7ReverseInt=new L7ReverseInt();
        int result=l7ReverseInt.reverse(input);
        assertEquals(result,321);
    }
    @Test
    void should_return__321_when_reverse_given__123() {
        int input=-123;
        L7ReverseInt l7ReverseInt=new L7ReverseInt();
        int result=l7ReverseInt.reverse(input);
        assertEquals(result,-321);
    }
    @Test
    void should_return_21_when_reverse_given_120() {
        int input=120;
        L7ReverseInt l7ReverseInt=new L7ReverseInt();
        int result=l7ReverseInt.reverse(input);
        assertEquals(result,21);
    }
    @Test
    void should_return_0_when_reverse_given_9646324351() {
        int input=1534236469;
        L7ReverseInt l7ReverseInt=new L7ReverseInt();
        int result=l7ReverseInt.reverse(input);
        assertEquals(result,0);
    }
}
