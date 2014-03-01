package utils;

import java.util.Arrays;

/**
 * User: jatin
 */
public class Utils {
    public static boolean isPrime(Long primeNumber) {
        if(primeNumber < 2) return false;
        for(long i=2; i <= new Double(Math.sqrt(primeNumber.doubleValue())).longValue() ; i++) {
            if( primeNumber % i == 0) return false;
        }
        return true;
    }

    public static boolean isPalindrom(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return reversed.toString().equals(str);
    }

    public static long factorial(long i) {
        if( i == 0) return 1;
        return i * factorial(i -1);
    }

    public static String sortedString(String original) {
        char[] chars = original.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
