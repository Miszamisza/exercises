public class BitCounting {

    public static int countBits(int n) {
        int result = 0, counter = 0;
        String binaryReverseString = "";
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                binaryReverseString = binaryReverseString.concat("0");
            } else {
                binaryReverseString = binaryReverseString.concat("1");
                n = n / 2;
                counter++;
            }
        }
       return counter;
    }
}
