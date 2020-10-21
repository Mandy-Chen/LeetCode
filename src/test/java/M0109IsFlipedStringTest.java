import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class M0109IsFlipedStringTest {
    @Test
    void name() {
        String s1="waterbottle";
        String s2="erbottlewat";
        M0109IsFlipedString m0109IsFlipedString=new M0109IsFlipedString();
        Boolean result=m0109IsFlipedString.isFlipedString(s1,s2);
        assertTrue(result);
    }
    @Test
    void name1() {
        String s1="aa";
        String s2="aba";
        M0109IsFlipedString m0109IsFlipedString=new M0109IsFlipedString();
        Boolean result=m0109IsFlipedString.isFlipedString(s1,s2);
        assertFalse(result);
    }
    @Test
    void name2() {
        String s1="aba";
        String s2="bab";
        M0109IsFlipedString m0109IsFlipedString=new M0109IsFlipedString();
        Boolean result=m0109IsFlipedString.isFlipedString(s1,s2);
        assertFalse(result);
    }
}
