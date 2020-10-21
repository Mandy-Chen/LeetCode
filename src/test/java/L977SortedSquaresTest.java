import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L977SortedSquaresTest {
    @Test
    void name() {
        int[] A={-4,-1,0,3,10};
        L977SortedSquares l977SortedSquares=new L977SortedSquares();
        int[] result=l977SortedSquares.sortedSquares(A);
        assertArrayEquals(result ,new int[] {0,1,9,16,100});
    }
    @Test
    void name1() {
        int[] A={-7,-3,2,3,11};
        L977SortedSquares l977SortedSquares=new L977SortedSquares();
        int[] result=l977SortedSquares.sortedSquares(A);
        assertArrayEquals(result ,new int[] {4,9,9,49,121});
    }
}
