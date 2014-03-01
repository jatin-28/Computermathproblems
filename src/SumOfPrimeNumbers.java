import java.util.ArrayList;
import java.util.List;

/**
 * User: jatin
 */
public class SumOfPrimeNumbers {
    public static boolean isPrime(Long primeNumber) {
        for(long i=2; i <= new Double(Math.sqrt(primeNumber.doubleValue())).longValue() ; i++) {
            if( primeNumber % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long sumOfPrimes = 0;
        List<String> listOfPrimes = new ArrayList<String>(2000000);
        for(long i=2; i< 2000000; i++) {
            if( isPrime(i)) {
                sumOfPrimes += i;
                listOfPrimes.add(i + "");
            }
        }

        for (String listOfPrime : listOfPrimes) {
            System.out.println(listOfPrime);
        }

        System.out.println("Sum of primes: " + sumOfPrimes);
    }
}
