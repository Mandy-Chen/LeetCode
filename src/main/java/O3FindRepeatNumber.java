public class O3FindRepeatNumber {
    public int findRepeatNumber(int[] nums) {
        int[] count=new int[100000];
        for (int i:nums) {
            count[i]++;
        }
        for (int i = 0; i < count.length; i++) {
            if(count[i]>1){
                return i;
            }
        }
        return 0;
    }
}
