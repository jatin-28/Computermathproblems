/**
 * User: jatin
 */
public class LexicographicPermutations {
    static String perm = "0123456789";
    static int counter = 0;

    public static void main(String[] args) {
        permutation(perm);
    }

    public  static void permutation(String str) {
        permutation("", str);
    }

    private static void permutation(String prefix, String str) {
        int n = str.length();
        if (n == 0) {
            counter++;
            System.out.println(prefix);
            if( counter == 1000000) {
                System.exit(0);
            }
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

}
