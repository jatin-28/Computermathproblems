import java.math.BigInteger;

/**
 * User: jatin
 */
public class FactorialDigitSum {
    public static BigInteger factorial(int n) {
        BigInteger product = BigInteger.ONE;
        for(int i=2; i <= n; i++) {
            product = product.multiply(new BigInteger(i + ""));
        }
        return product;
    }

    public static long sumOfDigits(String s) {
        char[] chars = s.toCharArray();
        long sum = 0;
        for (char aChar : chars) {
            sum += ((int)aChar) - 48;
        }
        return sum;
    }

    public static void main(String[] args) {
        BigInteger factorial = factorial(100);
        System.out.println(factorial + " - sum: " + sumOfDigits(factorial.toString()));
    }

}
