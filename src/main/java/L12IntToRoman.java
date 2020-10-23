public class L12IntToRoman {
    public String intToRoman(int num) {
        String str = String.valueOf(num);
        String[] strNums = str.split("");
        String result = "";
        String[] one = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        String[] two = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] three = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] four = {"", "M", "MM", "MMM"};
        int order = str.length();
        for (int i = 0; i < str.length(); i++) {
            if (order == 4) {
                result += four[Integer.parseInt(strNums[i])];
            }
            if (order == 3) {
                result += three[Integer.parseInt(strNums[i])];
            }
            if (order == 2) {
                result += two[Integer.parseInt(strNums[i])];
            }
            if (order == 1) {
                result += one[Integer.parseInt(strNums[i])];
            }
            order--;

        }
        return result;
    }
}
