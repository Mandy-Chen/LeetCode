import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L914HasGroupsSizeXTest {
    @Test
    void name() {
        int[] input={1,2,3,4,4,3,2,1};
        L914HasGroupsSizeX l914HasGroupsSizeX=new L914HasGroupsSizeX();
        Boolean result=l914HasGroupsSizeX.hasGroupsSizeX(input);
        assertTrue(result);
    }
    @Test
    void test() {
        int[] input={1,1,1,2,2,2,3,3};
        L914HasGroupsSizeX l914HasGroupsSizeX=new L914HasGroupsSizeX();
        Boolean result=l914HasGroupsSizeX.hasGroupsSizeX(input);
        assertFalse(result);
    }
    @Test
    void test1() {
        int[] input={1};
        L914HasGroupsSizeX l914HasGroupsSizeX=new L914HasGroupsSizeX();
        Boolean result=l914HasGroupsSizeX.hasGroupsSizeX(input);
        assertFalse(result);
    }
    @Test
    void test2() {
        int[] input={1,1};
        L914HasGroupsSizeX l914HasGroupsSizeX=new L914HasGroupsSizeX();
        Boolean result=l914HasGroupsSizeX.hasGroupsSizeX(input);
        assertTrue(result);
    }
    @Test
    void test3() {
        int[] input={1,1,2,2,2,2};
        L914HasGroupsSizeX l914HasGroupsSizeX=new L914HasGroupsSizeX();
        Boolean result=l914HasGroupsSizeX.hasGroupsSizeX(input);
        assertTrue(result);
    }
    @Test
    void test4() {
        int[] input={0,0,0,1,1,1,2,2,2};
        L914HasGroupsSizeX l914HasGroupsSizeX=new L914HasGroupsSizeX();
        Boolean result=l914HasGroupsSizeX.hasGroupsSizeX(input);
        assertTrue(result);
    }
}
