import java.math.BigInteger;

/**
 * User: jatin
 */
public class PowerfulDigitCounts {
    public static void main(String[] args) {
        long maxDigiSum = 0;
        for(int a=1; a < 100; a++) {
            for(int b=1; b < 100; b++) {
                BigInteger pow = new BigInteger(a + "").pow(b);
                if( pow.toString().length() == b) {
                    maxDigiSum++;
                    System.out.println(pow + " = " + a + "^" + b);
                }

            }
        }
        System.out.println("count: " + maxDigiSum);
    }
}
