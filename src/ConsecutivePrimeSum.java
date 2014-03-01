import java.util.ArrayList;
import java.util.List;

import static utils.Utils.isPrime;

/**
 * User: jatin
 */
public class ConsecutivePrimeSum {

    public static final int INT = 1000000;

    public static void main(String[] args) {
        List<LargestPrimeHolder> list = new ArrayList<LargestPrimeHolder>();
        for( long i = 2; i < INT / 2; i++) {
            if( isPrime(i)) {
                list.add(findLargestPrime(i));
            }
        }

        LargestPrimeHolder currentLargest = list.get(0);
        for (LargestPrimeHolder largestPrimeHolder : list) {
            if (largestPrimeHolder.currentNumberOfTerms > currentLargest.currentNumberOfTerms) {
                currentLargest = largestPrimeHolder;
            }
        }
        currentLargest.print();
    }

    private static LargestPrimeHolder findLargestPrime(long s) {
        long sum = 0;
        long currentLargestPrime = 0;
        int numberOfTerms = 0;
        int currentNumberOfTerms = 0;

        for(long i=s; i < INT / 2; i++) {
            if( isPrime(i)) {
                System.out.println(i);
                long temp = sum + i;
                if( temp > INT) {
                    break;
                }
                sum = temp;
                numberOfTerms++;
                if( isPrime(sum) ) {
                    currentLargestPrime = sum;
                    currentNumberOfTerms = numberOfTerms;
                }
            }
        }

        return new LargestPrimeHolder(currentLargestPrime, currentNumberOfTerms);
    }

    static class LargestPrimeHolder{
        long currentLargestPrime;
        long currentNumberOfTerms;

        LargestPrimeHolder(long currentLargestPrime, long currentNumberOfTerms) {
            this.currentLargestPrime = currentLargestPrime;
            this.currentNumberOfTerms = currentNumberOfTerms;
        }

        public void print() {
            System.out.println("largest: " + currentLargestPrime);
            System.out.println("number of terms: " + currentNumberOfTerms);
        }
    }
}
