import java.math.BigInteger;

/**
 * User: jatin
 */
public class SelfPowers {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        for(int i=1; i <= 1000; i++) {
            BigInteger pow = new BigInteger(i + "").pow(i);
            sum = sum.add(pow);
        }
        System.out.println(sum);
    }
}
