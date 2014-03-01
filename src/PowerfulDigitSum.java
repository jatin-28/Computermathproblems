import java.math.BigInteger;

/**
 * User: jatin
 */
public class PowerfulDigitSum {
    public static void main(String[] args) {
        long maxDigiSum = 0;
        for(int a=0; a < 100; a++) {
            for(int b=0; b < 100; b++) {
                BigInteger pow = new BigInteger(a + "").pow(b);
                long sum = sumOfDigits(pow.toString());
                if (sum > maxDigiSum) maxDigiSum = sum;
            }
        }
        System.out.println("sum: " + maxDigiSum);
    }

    private static long sumOfDigits(String s) {
        char[] chars = s.toCharArray();
        long sum = 0;
        for (char aChar : chars) {
            int digit = aChar - '0';
            sum += digit;
        }

        return sum;
    }
}
