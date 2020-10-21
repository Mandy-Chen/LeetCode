
public class O58ReverseWords {
    public String reverseWords(String s) {
        String[] str = s.split("\\s+");
        int left = 0;
        int right = str.length - 1;
        String temp = "";
        String result = "";
        if (str.length > 0) {
            do {
                temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            } while (left < right);
            for (int i = 0; i < str.length; i++) {
                result += str[i] + " ";
            }
        }
        return result.trim();
    }
}
