import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L1470ShuffleTest {
    @Test
    void name() {
        int[] nums={2,5,1,3,4,7};
        int n=3;
        L1470Shuffle l1470Shuffle=new L1470Shuffle();
        int[] result=l1470Shuffle.shuffle(nums,n);
        assertArrayEquals(result,new int[] {2,3,5,4,1,7} );
    }
    @Test
    void name1() {
        int[] nums={1,2,3,4,4,3,2,1};
        int n=4;
        L1470Shuffle l1470Shuffle=new L1470Shuffle();
        int[] result=l1470Shuffle.shuffle(nums,n);
        assertArrayEquals(result,new int[] {1,4,2,3,3,2,4,1} );
    }
    @Test
    void name2() {
        int[] nums={1,1,2,2};
        int n=2;
        L1470Shuffle l1470Shuffle=new L1470Shuffle();
        int[] result=l1470Shuffle.shuffle(nums,n);
        assertArrayEquals(result,new int[] {1,2,1,2} );
    }
}
