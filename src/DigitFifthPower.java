/**
 * User: jatin
 */
public class DigitFifthPower {
    private static final double POWER_OF = 5;

    public static long sumOfDigits(String s) {
        char[] chars = s.toCharArray();
        long sum = 0;
        for (char aChar : chars) {
            long digit = ((int)aChar) - '0';
            sum += Math.pow(digit, POWER_OF);
        }
        return sum;
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        long totalsum = 0;

        for(long i=2; i < 10000000; i++) {
            long currentSum = sumOfDigits(i + "");
            if( currentSum == i) {
                totalsum += currentSum;
            }
        }

        System.out.println("Total sum: " + totalsum);
        System.out.println("Time: " + (System.currentTimeMillis() - start));
    }

}
