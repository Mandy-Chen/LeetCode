import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class O40GetLeastNumbersTest {
    @Test
    void name() {
        int[] input={3,2,1};
        O40GetLeastNumbers o40GetLeastNumbers=new O40GetLeastNumbers();
        int[] result=o40GetLeastNumbers.getLeastNumbers(input,2);
        assertArrayEquals(result, new int[]{1, 2});
    }
    @Test
    void test() {
        int[] input={1,2,3};
        O40GetLeastNumbers o40GetLeastNumbers=new O40GetLeastNumbers();
        int[] result=o40GetLeastNumbers.getLeastNumbers(input,2);
        assertArrayEquals(result, new int[]{1, 2});
    }
    @Test
    void test1() {
        int[] input={0,1,2,1};
        O40GetLeastNumbers o40GetLeastNumbers=new O40GetLeastNumbers();
        int[] result=o40GetLeastNumbers.getLeastNumbers(input,1);
        assertArrayEquals(result, new int[]{0});
    }
}
