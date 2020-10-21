
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class O50FirstUniqChar {
    public char firstUniqChar(String s) {
        char result = ' ';
        for (int i = 0; i < s.length(); i++) {
            if (s.length() == 1) {
                result = s.charAt(0);
                break;
            }
            if (i < s.length() - 1 && s.substring(i + 1).indexOf(s.charAt(i)) == -1) {
                result = s.charAt(i);
                break;
            }
            s = s.replaceAll(String.valueOf(s.charAt(i)), "");
            i--;
        }
        return result;
    }
}
