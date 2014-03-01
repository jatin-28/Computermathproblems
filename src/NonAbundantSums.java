import java.util.ArrayList;
import java.util.List;

/**
 * User: jatin
 */
public class NonAbundantSums {
    public static int sumOfDivisors(int num) {
        int sum = 0;
        for(int i=1; i < (num / 2 + 1); i++) {
            if( num % i == 0) sum += i;
        }
        return sum;
    }

    public static boolean isAbundantNumber(int num) {
        return sumOfDivisors(num) > num;
    }

    public static void main(String[] args) {
        long sumOfNonAbundant = 0;
        List<Integer> abundantList = new ArrayList<Integer>();
        for(int i=1; i <= 28123; i++ ) {
            if( isAbundantNumber(i)) abundantList.add(i);
        }

        for(int j=1; j <= 28123; j++ ) {
            boolean isSumOfAbund = false;
            for (Integer abund : abundantList) {
                int secondAbund = j - abund;
                if( secondAbund > 0 && abundantList.contains(secondAbund)) {
                    isSumOfAbund = true;
                    break;
                }
            }
            if(!isSumOfAbund) sumOfNonAbundant += j;
        }
        System.out.println(sumOfNonAbundant);
    }

}
