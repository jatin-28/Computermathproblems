import java.math.BigInteger;

/**
 * User: jatin
 */
public class PowerDigitSum {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("2").pow(1000);
        String s = big.toString();

        char[] chars = s.toCharArray();
        long sum = 0;
        for (char aChar : chars) {
            sum += ((int)aChar) - 48;
        }
        System.out.println(sum);
    }
}
