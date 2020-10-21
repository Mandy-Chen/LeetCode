public class O17PrintNumbers {
    public int[] printNumbers(int n) {
        int maxNum= (int) Math.pow(10,n)-1;
        int[] result=new int[maxNum];
        for (int i = 1; i <result.length+1 ; i++) {
            result[i-1]=i;
        }
        return result;

    }
}
