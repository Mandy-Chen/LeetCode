import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class L1528RestoreStringTest {
    @Test
    void name() {
        String s="codeleet";
        int[] indices={4,5,6,7,0,2,1,3};
        L1528RestoreString l1528RestoreString=new L1528RestoreString();
        String result=l1528RestoreString.restoreString(s,indices);
        assertEquals(result,"leetcode");
    }
    @Test
    void name1() {
        String s="abc";
        int[] indices={0,1,2};
        L1528RestoreString l1528RestoreString=new L1528RestoreString();
        String result=l1528RestoreString.restoreString(s,indices);
        assertEquals(result,"abc");
    }
    @Test
    void name2() {
        String s="aiohn";
        int[] indices={3,1,4,2,0};
        L1528RestoreString l1528RestoreString=new L1528RestoreString();
        String result=l1528RestoreString.restoreString(s,indices);
        assertEquals(result,"nihao");
    }
    @Test
    void name3() {
        String s="aaiougrt";
        int[] indices={4,0,2,6,7,3,1,5};
        L1528RestoreString l1528RestoreString=new L1528RestoreString();
        String result=l1528RestoreString.restoreString(s,indices);
        assertEquals(result,"arigatou");
    }
    @Test
    void name4() {
        String s="art";
        int[] indices={1,0,2};
        L1528RestoreString l1528RestoreString=new L1528RestoreString();
        String result=l1528RestoreString.restoreString(s,indices);
        assertEquals(result,"rat");
    }
}
