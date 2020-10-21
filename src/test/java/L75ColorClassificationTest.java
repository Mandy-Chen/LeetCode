import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class L75ColorClassificationTest {
    @Test
    public void test() {
        //given
        Integer[] colors = {2, 0, 2, 1, 1, 0};
        L75ColorClassification l75ColorClassification = new L75ColorClassification();
        Integer[] result = l75ColorClassification.ColorClassification(colors);
        assertArrayEquals(result, new Integer[]{0, 0, 1, 1, 2, 2});
    }
}
