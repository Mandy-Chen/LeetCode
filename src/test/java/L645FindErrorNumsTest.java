import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class L645FindErrorNumsTest {
    @Test
    void name() {
        int[] nums={1,2,2,4};
        L645FindErrorNums l645FindErrorNums=new L645FindErrorNums();
        int[] result=l645FindErrorNums.findErrorNums(nums);
        assertArrayEquals(result,new int[] {2,3});
    }
    @Test
    void name1() {
        int[] nums={1,1};
        L645FindErrorNums l645FindErrorNums=new L645FindErrorNums();
        int[] result=l645FindErrorNums.findErrorNums(nums);
        assertArrayEquals(result,new int[] {1,2});
    }
    @Test
    void name2() {
        int[] nums={2,2};
        L645FindErrorNums l645FindErrorNums=new L645FindErrorNums();
        int[] result=l645FindErrorNums.findErrorNums(nums);
        assertArrayEquals(result,new int[] {2,1});
    }
    @Test
    void name3() {
        int[] nums={3,2,3,4,6,5};
        L645FindErrorNums l645FindErrorNums=new L645FindErrorNums();
        int[] result=l645FindErrorNums.findErrorNums(nums);
        assertArrayEquals(result,new int[] {3,1});
    }
    @Test
    void name4() {
        int[] nums={5,3,6,1,5,4,7,8};
        L645FindErrorNums l645FindErrorNums=new L645FindErrorNums();
        int[] result=l645FindErrorNums.findErrorNums(nums);
        assertArrayEquals(result,new int[] {5,2});
    }
    @Test
    void name5() {
        int[] nums={1,5,3,2,2,7,6,4,8,9};
        L645FindErrorNums l645FindErrorNums=new L645FindErrorNums();
        int[] result=l645FindErrorNums.findErrorNums(nums);
        assertArrayEquals(result,new int[] {2,10});
    }
}
