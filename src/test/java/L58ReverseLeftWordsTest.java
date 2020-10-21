import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L58ReverseLeftWordsTest {
    @Test
    void should_return_cdefgab_given_abcdefg() {
        String inputValue="abcdefg";
        int num=2;
        L58ReverseLeftWords l58ReverseLeftWords=new L58ReverseLeftWords();
        String actualResult=l58ReverseLeftWords.reverseLeftWords(inputValue,num);
        assertEquals(actualResult,"cdefgab");
    }
    @Test
    void should_return_umghlrlose_given_lrloseumgh() {
        String inputValue="lrloseumgh";
        int num=6;
        L58ReverseLeftWords l58ReverseLeftWords=new L58ReverseLeftWords();
        String actualResult=l58ReverseLeftWords.reverseLeftWords(inputValue,num);
        assertEquals(actualResult,"umghlrlose");
    }
}
