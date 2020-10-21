import java.util.Arrays;

public class O11MinArray {
    public int minArray(int[] numbers) {
        int result=Arrays.stream(numbers).min().getAsInt();
        return result;
    }
}
