import java.text.MessageFormat;

/**
 * User: jatin
 */
public class QuadraticPrimes {
    public static boolean isPrime(Long primeNumber) {
        for(long i=2; i <= new Double(Math.sqrt(primeNumber.doubleValue())).longValue() ; i++) {
            if( primeNumber % i == 0) return false;
        }
        return true;
    }

    private static long quadratic(long n, long a, long b) {
        return n * n + a * n + b;
    }

    public static void main(String[] args) {
        long amx =0;
        long bmx = 0;
        long nmx = 0;

        for(long a = -1000; a < 1000; a++) {
            for(long b = -1000; b < 1000; b++) {
                long n = 0;
                while (true) {
                    long quadratic = quadratic(n, a, b);
                    if(!isPrime(Math.abs(quadratic))) {
                        if( n > nmx) {
                            nmx = n;
                            amx = a;
                            bmx = b;
                        }
                        break;
                    }
                    n++;
                }
            }
        }

        System.out.println(MessageFormat.format("number of primes: {0} - Co-efficient: {1} * {2} = {3}", nmx, amx, bmx, (amx * bmx)));
    }

}
