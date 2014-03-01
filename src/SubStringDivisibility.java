/**
 * User: jatin
 */
public class SubStringDivisibility {
    static String perm = "0123456789";
    static int[] primes = new int[] {2,3,5,7,11,13,17};
    static long sum = 0;

    public static void main(String[] args) {
        permutation("", perm);
        //subStringDivisibility("1406357289");
        System.out.println("sum: " + sum);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            //System.out.println(prefix);
            subStringDivisibility(prefix);
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    private static void subStringDivisibility(String prefix) {
        char[] chars = prefix.toCharArray();
        boolean hasProperty = true;
        for(int d=1; d < 8; d++) {
            Integer substring = Integer.valueOf("" + chars[d] + chars[d + 1] + chars[d + 2]);
            //System.out.println(substring + " : " + primes[d -1]);
            int divisor = substring % primes[d - 1];
            if(divisor != 0) {
                hasProperty = false;
                break;
            }
        }
        if( hasProperty) {
            sum += Long.valueOf(prefix);
        }
    }
}
