import java.util.HashSet;
import java.util.Set;

/**
 * User: jatin
 */
public class PandigitalProducts {
    public static String numbers = "123456789";
    private static Set<Long> sumSet = new HashSet<Long>();

    public static boolean isPanDigital(String multiplicand, String multiplier, String product) {
        return Long.valueOf(multiplicand) * Long.valueOf(multiplier) == Long.valueOf(product);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            //System.out.println(prefix);

            //if( count++ == 100) System.exit(0);

            for(int m=1;m<prefix.length() - 1; m++) {
                for( int r=m + 1; r<prefix.length() - m; r++) {
                    String multicand = prefix.substring(0, m);
                    String multiplier = prefix.substring(m,r);
                    String product = prefix.substring(r, prefix.length());

                    //System.out.println(multicand + " * " + multiplier + " = " + product);

                    if(isPanDigital(multicand, multiplier, product)) {
                        System.out.println(multicand + " * " + multiplier + " = " + product);
                        sumSet.add(Long.valueOf(product));
                    }
                }
            }
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        long sum = 0;

        //System.out.println(numbers.substring(1, 2));

        permutation("",numbers);

        /*if(isPanDigital("39", "186", "7254")) {
            sum += Long.valueOf("7254");
        }*/

        for (Long aLong : sumSet) {
            sum += aLong;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Time: " + (System.currentTimeMillis() - start) );

    }
}
