import java.math.BigInteger;

import static utils.Utils.isPalindrom;

/**
 * User: jatin
 */
public class LychrelNumbers {

    public static boolean findPalinDrome(BigInteger n) {
        int iterationCount = 0;
        BigInteger currentNumber = n;
        while (iterationCount < 50) {
            BigInteger l = sumOfNumberAndReverse(currentNumber);
            if(isPalindrom(l.toString() + "")) {
                return true;
            }
            iterationCount++;
            currentNumber = l;
        }
        return false;
    }

    public static BigInteger sumOfNumberAndReverse(BigInteger n) {
        return n.add(new BigInteger(new StringBuilder(n + "").reverse().toString()));
    }

    public static void main(String[] args) {
        int numberOfLychrelNumbers = 0;
        for(int i=1; i < 10000; i++) {
            if( !findPalinDrome(new BigInteger(i + ""))) numberOfLychrelNumbers++;
            /*else {
                System.out.println(i);
            }*/
        }
        System.out.println("count: " + numberOfLychrelNumbers);
    }
}
