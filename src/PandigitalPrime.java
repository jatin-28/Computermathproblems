import static utils.Utils.isPrime;
import static utils.Utils.sortedString;

/**
 * User: jatin
 */
public class PandigitalPrime {
    static String numbers = "123456789";
    private static long largestPrime = 0;

    public static boolean hasDuplicateNumbers(String line) {
        for(char c= '1'; c <= '9'; c++ ) {
            int count = line.length() - line.replace(c + "", "").length();
            if( count > 1) return true;
        }
        return false;
    }

    private static void permutation(String prefix, String str) {
        if( !prefix.isEmpty()) {
            long l = Long.valueOf(prefix);
            if(isPandigital(prefix) && isPrime(l)) {
                if( l > largestPrime) largestPrime = l;
            }
        }

        int n = str.length();
        if (n == 0) {
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    private static boolean isPandigital(String prefix) {
        return prefix.contains("1") && numbers.contains(sortedString(prefix));
    }

    public static void main(String[] args) {
        permutation("", numbers);
        /*for( long n = 211; n < 987654321; n++  ) {
            String line = n + "";
            if(!line.contains("0") && !hasDuplicateNumbers(line) && isPrime(n)) {
                System.out.println(n);
                return ;
            }
        }*/
        System.out.println(largestPrime);
    }
}
