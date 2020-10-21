import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1486XorOperationTest {
    @Test
    void name() {
        int n =5;
        int start=0;
        L1486XorOperation l1486XorOperation=new L1486XorOperation();
        int result=l1486XorOperation.xorOperation(n,start);
        assertEquals(result,8);
    }
    @Test
    void name1() {
        int n =4;
        int start=3;
        L1486XorOperation l1486XorOperation=new L1486XorOperation();
        int result=l1486XorOperation.xorOperation(n,start);
        assertEquals(result,8);
    }
    @Test
    void name2() {
        int n =1;
        int start=7;
        L1486XorOperation l1486XorOperation=new L1486XorOperation();
        int result=l1486XorOperation.xorOperation(n,start);
        assertEquals(result,7);
    }
    @Test
    void name3() {
        int n =10;
        int start=5;
        L1486XorOperation l1486XorOperation=new L1486XorOperation();
        int result=l1486XorOperation.xorOperation(n,start);
        assertEquals(result,2);
    }
}
