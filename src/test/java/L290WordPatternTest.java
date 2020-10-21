import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class L290WordPatternTest {
    @Test
    void name() {
        String pattern="abba";
        String inputStr="dog cat cat dog";
        L290WordPattern l290WordPattern=new L290WordPattern();
        Boolean result=l290WordPattern.wordPattern(pattern,inputStr);
        assertTrue(result);
    }
    @Test
    void name1() {
        String pattern="abba";
        String inputStr="dog cat cat fish";
        L290WordPattern l290WordPattern=new L290WordPattern();
        Boolean result=l290WordPattern.wordPattern(pattern,inputStr);
        assertFalse(result);
    }
    @Test
    void name2() {
        String pattern="aaaa";
        String inputStr="dog cat cat dog";
        L290WordPattern l290WordPattern=new L290WordPattern();
        Boolean result=l290WordPattern.wordPattern(pattern,inputStr);
        assertFalse(result);
    }
    @Test
    void name3() {
        String pattern="abba";
        String inputStr="dog dog dog dog";
        L290WordPattern l290WordPattern=new L290WordPattern();
        Boolean result=l290WordPattern.wordPattern(pattern,inputStr);
        assertFalse(result);
    }
    @Test
    void name4() {
        String pattern="a";
        String inputStr="a";
        L290WordPattern l290WordPattern=new L290WordPattern();
        Boolean result=l290WordPattern.wordPattern(pattern,inputStr);
        assertTrue(result);
    }
    @Test
    void name5() {
        String pattern="abc";
        String inputStr="b c a";
        L290WordPattern l290WordPattern=new L290WordPattern();
        Boolean result=l290WordPattern.wordPattern(pattern,inputStr);
        assertTrue(result);
    }
    @Test
    void name6() {
        String pattern="aaa";
        String inputStr="b c a";
        L290WordPattern l290WordPattern=new L290WordPattern();
        Boolean result=l290WordPattern.wordPattern(pattern,inputStr);
        assertFalse(result);
    }
    @Test
    void name7() {
        String pattern="jquery";
        String inputStr="jquery";
        L290WordPattern l290WordPattern=new L290WordPattern();
        Boolean result=l290WordPattern.wordPattern(pattern,inputStr);
        assertFalse(result);
    }
}
