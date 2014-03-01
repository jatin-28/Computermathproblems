import java.util.HashSet;
import java.util.Set;

/**
 * User: jatin
 */
public class AmicableNumbers {

    public static long sumOfDivisors(long am) {
        long sumOfDivisors = 0;
        for( long j = 1; j < (am / 2) + 1; j++) {
            if( am % j == 0) sumOfDivisors += j;
        }
        return sumOfDivisors;
    }

    public static void main(String[] args) {
        Set<Long> amicableSet = new HashSet<Long>();

        for(long i=1; i < 10000; i++) {
            long b = sumOfDivisors(i);
            long c = sumOfDivisors(b);
            if( i == c && !(i == b)) {
                amicableSet.add(i);
                amicableSet.add(c);
                System.out.println("Amicable pair: " + i + "," + b);
            }
        }

        Long sumOfAmicable = 0l;
        for (Long aLong : amicableSet) {
            sumOfAmicable += aLong;
        }

        System.out.println(sumOfAmicable);
    }
}
