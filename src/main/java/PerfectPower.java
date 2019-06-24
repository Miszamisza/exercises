public class PerfectPower {
    public static int[] isPerfectPower(int n) {
        int[] result = new int[2];
        for (int i = 0; i <= n/2 ; i++) {
            for (int j = 0; j <= n/2; j++) {
                if (Math.pow(i, j)==n) {
                 result = new int[]{i, j};
                }
            }
        }
        if (result[0]==0){
            result=null;
        }
        return result;
    }
}