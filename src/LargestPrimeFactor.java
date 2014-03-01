/**
 * User: jatin
 */
public class LargestPrimeFactor {

    public static void main(String[] args) {
        //printPrimeNumbersTo(100);
        Long theNumber = 600851475143l;
        //long theNumber = 13195;
        for(long i= new Double(Math.sqrt(theNumber.doubleValue())).longValue(); i > 2; i--) {
            if( canDivideExactly(theNumber, i) && isPrime(i)) {
                System.out.println("Largest Prime Factor: " + i);
                break;
            }
        }
    }

    public static void printPrimeNumbersTo(long number) {
        System.out.print("PrimeNumber list: ");
        for(long i=2; i < number; i++) {
            if(isPrime(i)) System.out.print(i + ",");
        }
    }

    public static boolean canDivideExactly (long theNumber, long denominator) {
        return theNumber % denominator == 0;
    }

    public static boolean isPrime(Long primeNumber) {
        for(long i=2; i <= new Double(Math.sqrt(primeNumber.doubleValue())).longValue() ; i++) {
            if( primeNumber % i == 0) return false;
        }
        return true;
    }

}
