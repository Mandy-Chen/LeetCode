import java.util.Arrays;

public class P18BreakfastNumber {
    public int breakfastNumber(int[] staple, int[] drinks, int x) {
        int NUMBER = 1000000007;
        long result = 0;
        Arrays.sort(staple);
        Arrays.sort(drinks);
        for (int i = 0; i < staple.length; i++) {
            if (i > x) break;
            else {
                result += bound(drinks, x - staple[i]);
            }
        }
        return (int) (result % NUMBER);
    }

    int bound(int[] drinks, int x) {
        int begin = 0;
        int end = drinks.length;
        while (begin < end) {
            int mid = begin + (end - begin) / 2;
            if (drinks[mid] > x) {
                end = mid ;
            } else {
                begin = mid + 1;
            }
        }
        return begin;
    }
}
