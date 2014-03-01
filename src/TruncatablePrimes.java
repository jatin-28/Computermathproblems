import utils.Utils;

import static utils.Utils.isPrime;

/**
 * User: jatin
 */
public class TruncatablePrimes {

    public static void main(String[] args) {
        long number = 10;
        long primeCounter = 0;
        long sum = 0;

        while (primeCounter < 11) {
            if(Utils.isPrime(++number)) {
                if( isPrimeTruncLToR(number +"") && isPrimeTruncRToL(number + "")) {
                    System.out.println("truncprime: " + number);
                    sum+=number;
                    primeCounter++;
                }
            }
        }

        System.out.println(sum);
        System.out.println(primeCounter);
    }

    private static boolean isPrimeTruncLToR(String str) {
        System.out.println("===" + str);
        boolean allPrime = isPrime(Long.valueOf(str));
        if(!allPrime) return false;

        if( str.length() == 1 ) return true;

        return isPrimeTruncLToR(str.substring(1));
    }

    private static boolean isPrimeTruncRToL(String str) {
        System.out.println("===" + str);

        boolean allPrime = isPrime(Long.valueOf(str));
        if(!allPrime) return false;

        if( str.length() == 1 ) return true;

        return isPrimeTruncRToL(str.substring(0, str.length() - 1));
    }

}
