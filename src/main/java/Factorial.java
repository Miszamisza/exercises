import java.math.BigInteger;

import static java.math.BigInteger.*;

public class Factorial {

    BigInteger factorial(BigInteger n){
        if (BigInteger.valueOf(0).compareTo(n) ==-1){
            return BigInteger.valueOf(-1);
        }
        if (n.equals(ONE) || n.equals(ZERO)){
            return BigInteger.valueOf(1);
        }
        else {
            return n.multiply(factorial(n.subtract(ONE)));
        }

    }

    public static void main(String[] args) {

        BigInteger bigInteger = BigInteger.valueOf(9);
        Factorial factorial = new Factorial();
        System.out.println(factorial.factorial(bigInteger));
    }
}
