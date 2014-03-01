import static utils.Utils.isPrime;

/**
 * User: jatin
 */
public class CicularPrimes {


    public static void main(String[] args) {
        int count = 0;
        for(long i=2; i < 1000000; i++) {
            if( isPrime(i) && isCircular(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Number of circular: " + count);
    }

    private static boolean isCircular(long i) {
        return isPrimeCircular(i+"", 0);
    }

    private static boolean isPrimeCircular(String str, int rotation) {
        //System.out.println("===" + str);
        boolean allPrime = isPrime(Long.valueOf(str));
        if(!allPrime) return false;
        rotation++;
        return rotation == str.length() || isPrimeCircular(str.substring(1) + str.charAt(0), rotation);
    }

}
