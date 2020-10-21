public class P17Calculate {
    public int calculate(String s) {
        String[] str=s.split("");
        int x=1;
        int y=0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("A")){
                x = 2 * x + y;
            }
            if(str[i].equals("B")){
                y = 2 * y + x;
            }
        }
        return x+y;
    }
}
