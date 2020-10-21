import java.util.Arrays;

public class L1528RestoreString {
    public String restoreString(String s, int[] indices) {
        char[] result=new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]]= s.charAt(i);
        }
        return String.valueOf(result);

    }
}
