import java.util.Arrays;

public class L48Rotate {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[i][j];
                matrix[i][j] = tmp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int l = 0;
            int r = matrix[i].length - 1;
            while (l < r) {
                int tmp = matrix[i][l];
                matrix[i][l] = matrix[i][r];
                matrix[i][r] = tmp;
                l++;
                r--;
            }
        }
    }
}
