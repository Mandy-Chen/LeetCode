import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class O5ReplaceSpaceTest {
    @Test
    void name() {
        String input="We are happy.";
        O5ReplaceSpace o5ReplaceSpace=new O5ReplaceSpace();
        String result=o5ReplaceSpace.replaceSpace(input);
        assertEquals(result,"We%20are%20happy.");
    }
}
