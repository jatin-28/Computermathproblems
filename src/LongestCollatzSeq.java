/**
 * User: jatin
 */
public class LongestCollatzSeq {

    public static void main(String[] args) {
        long startCLock = System.currentTimeMillis();

        long longestChain = 0;
        long numberOfLongestChain = 1000000;

        for( long s = numberOfLongestChain; s > 13; s-- ) {

            int currentChain = 0;
            long j = s;
            while (j > 1) {
                if( j % 2 == 0 ) {
                    j = j / 2;
                } else {
                    j = 3 * j +1;
                }
                currentChain++;
            }
            if( currentChain > longestChain) {
                longestChain = currentChain;
                numberOfLongestChain = s;
            }
        }

        System.out.println("Number of longest chain: " + numberOfLongestChain + " | length: " + longestChain );
        System.out.println("Timing: " + (System.currentTimeMillis() - startCLock) );

    }
}
