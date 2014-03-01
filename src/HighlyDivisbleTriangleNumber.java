import java.util.ArrayList;
import java.util.List;

/**
 * User: jatin
 */
public class HighlyDivisbleTriangleNumber {
    public static long nthTriangleNumber(long n) {
        return n * (n +1) /2;
    }

    public static void main(String[] args) {
        long nthTri = 14399 ;
        while(true) {
            List<Long> divisors = new ArrayList<Long>(505);
            nthTri--;
            long tri = nthTriangleNumber(nthTri);

            //if( tri % 2 != 0) continue;

            for( long j = 1; j < (tri / 2) + 1; j++) {
                if( tri % j == 0) divisors.add(j);
            }
            divisors.add(tri);
            System.out.println(nthTri + " | Triangle number: " + tri + " | number of divisors: " + divisors.size() );
            if( divisors.size() > 500) {
                System.out.println("====Triangle number: " + tri + " | number of divisors: " + divisors.size());
                return ;
            }
        }

    }
}
