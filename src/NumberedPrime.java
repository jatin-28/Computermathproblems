/**
 * User: jatin
 */
public class NumberedPrime {
    public static boolean isPrime(long primeNumber) {
        for(long i=2; i <= primeNumber / 2; i++) {
            if( primeNumber % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int primePos = 0;
        int currentPrime = 2;
        int currentNumber = 2;

        while(primePos < 10001) {
            if( isPrime(currentNumber)) {
                primePos++;
                currentPrime = currentNumber;
            }
            currentNumber++;
        }

        System.out.println("Prime at position: " + primePos + " : " + currentPrime);
    }

}
