//        给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
//        示例1:
//        输入: 123
//        输出: 321
//        示例 2:
//        输入: -123
//        输出: -321
//        示例 3:
//        输入: 120
//        输出: 21
//        注意:
//        假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为[−231, 231− 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
//        链接：https://leetcode-cn.com/problems/reverse-integer
public class L7ReverseInt {
    public int reverse(int x) {
        String str = String.valueOf(x);
        String revStr = "";
        int result=0;
        if (str.charAt(0) == 45) {
            revStr=new StringBuffer(str.substring(1)).reverse().toString();
            revStr="-"+revStr;
        } else {
            revStr = new StringBuffer(str).reverse().toString();
        }
        try {
             result = Integer.parseInt(revStr);
        }catch (Exception e){
            return 0;
        }
        return result;
    }
}
