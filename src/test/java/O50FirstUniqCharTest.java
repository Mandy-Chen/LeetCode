import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O50FirstUniqCharTest {
    @Test
    void name() {
        String input="abaccdeff";
        O50FirstUniqChar o50FirstUniqChar=new O50FirstUniqChar();
        char result=o50FirstUniqChar.firstUniqChar(input);
        assertEquals(result,'b');
    }
    @Test
    void test() {
        String input="cc";
        O50FirstUniqChar o50FirstUniqChar=new O50FirstUniqChar();
        char result=o50FirstUniqChar.firstUniqChar(input);
        assertEquals(result,' ');
    }
    @Test
    void test1() {
        String input="z";
        O50FirstUniqChar o50FirstUniqChar=new O50FirstUniqChar();
        char result=o50FirstUniqChar.firstUniqChar(input);
        assertEquals(result,'z');
    }
    @Test
    void test2() {
        String input="aadadaad";
        O50FirstUniqChar o50FirstUniqChar=new O50FirstUniqChar();
        char result=o50FirstUniqChar.firstUniqChar(input);
        assertEquals(result,' ');
    }
    @Test
    void test3() {
        String input="dddccdbba";
        O50FirstUniqChar o50FirstUniqChar=new O50FirstUniqChar();
        char result=o50FirstUniqChar.firstUniqChar(input);
        assertEquals(result,'a');
    }
}
