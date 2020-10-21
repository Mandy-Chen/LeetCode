import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O58ReverseWordsTest {
    @Test
    void name() {
        String input = "the sky is blue";
        String result = "blue is sky the";
        O58ReverseWords o58ReverseWords = new O58ReverseWords();
        String actualResult=o58ReverseWords.reverseWords(input);
        assertEquals(result,actualResult);
    }
    @Test
    void test() {
        String input = "  hello world!  ";
        String result = "world! hello";
        O58ReverseWords o58ReverseWords = new O58ReverseWords();
        String actualResult=o58ReverseWords.reverseWords(input);
        assertEquals(result,actualResult);
    }
    @Test
    void test1() {
        String input = "a good   example";
        String result ="example good a";
        O58ReverseWords o58ReverseWords = new O58ReverseWords();
        String actualResult=o58ReverseWords.reverseWords(input);
        assertEquals(result,actualResult);
    }
}
