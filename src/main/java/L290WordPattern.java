import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class L290WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        String[] pat = pattern.split("");
        System.out.println(pattern);
        System.out.println(Arrays.toString(str));
        System.out.println("-------------");
        Map<String, String> map = new HashMap<>();
        Boolean result = true;

        if (str.length == pat.length) {
            if (str.length != 1) {
                for (int i = 0; i < pattern.length(); i++) {
                    System.out.println(i);
                    if (map.containsKey(str[i])) {
                        System.out.println("map.get(str[i])" + map.get(str[i]));
                        System.out.println("pattern.charAt(i)" + pat[i]);
                        if (pat[i].equals(map.get(str[i]))) {
                            result = true;
                        } else {
                            return false;
                        }
                    } else if (map.containsValue(pat[i])) {
                        return false;
                    } else {
                        map.put(str[i], pat[i]);
                        System.out.println(map);
                        System.out.println(map.get(str[i]));
                        result = true;
                    }
                    System.out.println(result);
                    System.out.println("---------");
                }
            } else {
                result = true;

            }
        } else {
            result =  false;
        }
        return result;
    }
}
