import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P18BreakfastNumberTest {
    @Test
    void name() {
        int[] staple={10,20,5};
        int[] drinks={5,5,2};
        int x=15;
        P18BreakfastNumber p18BreakfastNumber=new P18BreakfastNumber();
        int result=p18BreakfastNumber.breakfastNumber(staple,drinks,x);
        assertEquals(result,6);
    }
    @Test
    void test() {
        int[] staple={2,1,1};
        int[] drinks={8,9,5,1};
        int x=9;
        P18BreakfastNumber p18BreakfastNumber=new P18BreakfastNumber();
        int result=p18BreakfastNumber.breakfastNumber(staple,drinks,x);
        assertEquals(result,8);
    }
}
