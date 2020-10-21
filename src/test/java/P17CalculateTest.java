import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class P17CalculateTest {
    @Test
    void name() {
        String input= "AB";
        P17Calculate p17Calculate=new P17Calculate();
        int result=p17Calculate.calculate(input);
        assertEquals(result,4);
    }
    @Test
    void test() {
        String input= "A";
        P17Calculate p17Calculate=new P17Calculate();
        int result=p17Calculate.calculate(input);
        assertEquals(result,2);
    }
    @Test
    void test1() {
        String input= "";
        P17Calculate p17Calculate=new P17Calculate();
        int result=p17Calculate.calculate(input);
        assertEquals(result,1);
    }
}
