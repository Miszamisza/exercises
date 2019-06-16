class SumParts {

    public static int[] sumParts(int[] ls) {
        int sum = 0, j = 0, i = 0;
        int[] sumParts = new int[ls.length+1];

        for (int l : ls) {
            sum += l;
        }
        while (i < sumParts.length-1) {
            sumParts[i] = sum;
            sum -= ls[j];
            j++;
            i++;
        }
        return sumParts;
    }
}