import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L136SingleNumberTest {
    @Test
    void name() {
        int[] input={2,2,1};
        L136SingleNumber l136SingleNumber=new L136SingleNumber();
        int result= l136SingleNumber.singleNumber(input);
        assertEquals(result,1);
    }
    @Test
    void name1() {
        int[] input={4,1,2,1,2};
        L136SingleNumber l136SingleNumber=new L136SingleNumber();
        int result= l136SingleNumber.singleNumber(input);
        assertEquals(result,4);
    }
    @Test
    void name2() {
        int[] input={-1};
        L136SingleNumber l136SingleNumber=new L136SingleNumber();
        int result= l136SingleNumber.singleNumber(input);
        assertEquals(result,-1);
    }
}
