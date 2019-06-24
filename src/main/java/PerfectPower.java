import com.sun.org.apache.bcel.internal.generic.GOTO;

public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        int[] result = new int[2];
        for (int i = 2; i < Math.log(n) / Math.log(2) + 1; i++) {
            for (int j = 2; Math.pow(j, i) <= n; j++) {
                if (Math.pow(i, j)==n) {
                 return result = new int[]{i, j};
                }
            }
        }

        return null;
    }
}