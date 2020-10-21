import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class O17PrintNumbersTest {
    @Test
    void name() {
        int n=1;
        O17PrintNumbers o17PrintNumbers=new O17PrintNumbers();
        int[] result=o17PrintNumbers.printNumbers(n);
        assertArrayEquals(result,new int[] {1,2,3,4,5,6,7,8,9});
    }
}
