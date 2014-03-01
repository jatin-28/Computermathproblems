/**
 * User: jatin
 */
public class PentagonNumbers {
    // TODO pentagon
    public static boolean checkPentagonal(long p) {
        double v = (1 + Math.sqrt(1 + 24 * p)) / 6;
        return v == Math.floor(v);
    }

    public static long pentagonal(long n) {
        return (n  * (3 *n - 1)) / 2;
    }

    public static void main(String[] args) {
        //System.out.println(checkPentagonal(145));
        System.out.println(findSumDiff());
    }

    private static long findSumDiff() {
        for(long j=1; j < 100000; j++) {
            for(long k=j+1; k < j+1000; k++) {
                long first = pentagonal(j);
                long sec = pentagonal(k);
                //System.out.println("j = " + first + "| k = " + sec);
                if( checkPentagonal( first + sec)) {
                    System.out.println("j = " + first + "| k = " + sec);
                    if(checkPentagonal( sec - first)) {
                        return sec - first;
                    }
                }
            }
        }
        return 0;
    }
}
