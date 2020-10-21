public class P6MinCount {
    public int minCount(int[] coins) {
        int result = 0;
        for (int i = 0; i < coins.length; i++) {
            if(coins[i]%2==0){
                result+=coins[i]/2;
            }else {
                result+=coins[i]/2+1;
            }
        }
        return result;
    }
}
