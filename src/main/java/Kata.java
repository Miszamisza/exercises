public class Kata {
     static int[][] matrixMultiplication(int[][] a, int[][] b) {
        int [][] c = new int[a.length-1][a.length-1];
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < b.length-1; j++) {
                c[i][j] = a[i][i] * b[j][j] + a[i][j+1] + b[i+1][j];
            }
        }
        return null;
    }
}
