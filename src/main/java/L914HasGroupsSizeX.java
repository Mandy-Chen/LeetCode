import java.util.Arrays;

public class L914HasGroupsSizeX {
    public boolean hasGroupsSizeX(int[] deck) {
        int[] count=new int[10000];
        for (int i:deck){
            count[i]++;
        }
        int x=0;
        for (int c:count){
            if(c>0){
                x=gdc(x,c);
            }
            if(x==1){
                return false;
            }
        }
        return x>=2;
    }

    private int gdc(int a,int b) {
        return b==0?a:gdc(b,a%b);
    }
}
