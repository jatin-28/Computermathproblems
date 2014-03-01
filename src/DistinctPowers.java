import java.util.HashSet;
import java.util.Set;

/**
 * User: jatin
 */
public class DistinctPowers {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        Set<Double> numbers = new HashSet<Double>();

        for(long a=2; a <=100; a++) {
            for(long b=2; b <=100; b++) {
                numbers.add(Math.pow(a, b));
            }
        }
        System.out.println(numbers.size());
        System.out.println("Time: " + (System.currentTimeMillis() - start));
    }
}
