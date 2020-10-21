import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O53SearchTest {
    @Test
    void name() {
        int[] nums={5,7,7,8,8,10};
        int target=8;
        O53Search o53Search=new O53Search();
        int result=o53Search.search(nums,target);
        assertEquals(result,2);
    }
    @Test
    void name1() {
        int[] nums={5,7,7,8,8,10};
        int target=6;
        O53Search o53Search=new O53Search();
        int result=o53Search.search(nums,target);
        assertEquals(result,0);
    }
}
