import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O65AddTest {
    @Test
    void name() {
        int a=1;
        int b=1;
        O65Add o65Add=new O65Add();
        int sum=o65Add.add(a,b);
        assertEquals(sum,2);
    }
}
