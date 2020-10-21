import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L344ReverseStringTest {
    @Test
    void when_input_not_empty() {
        char[] input={'h','e','l','l','o'};
        char[] result={'o','l','l','e','h'};
        L344ReverseString l344ReverseString=new L344ReverseString();
        l344ReverseString.reverseString(input);
        assertArrayEquals(input,result);
    }
    @Test
    void when_input_empty() {
        char[] input={};
        char[] result={};
        L344ReverseString l344ReverseString=new L344ReverseString();
        l344ReverseString.reverseString(input);
        assertArrayEquals(input,result);
    }
}
