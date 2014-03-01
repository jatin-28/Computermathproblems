import java.math.BigInteger;

/**
 * User: jatin
 */
public class CombinatoricSelections {
    public static BigInteger factorial(BigInteger i) {
        if( i.equals(BigInteger.ZERO)) return BigInteger.ONE;
        return i.multiply(factorial(i.add(BigInteger.ONE.negate())));
    }

    public static BigInteger combinations(BigInteger n, BigInteger r) {
        //System.out.println(factorial(n) + " / (" + factorial(r) + " * " + factorial(n - r) + ")");
        return factorial(n).divide(factorial(r).multiply(factorial(n.add(r.negate())))) ;
    }

    public static void main(String[] args) {
        int count = 0;
        for(int n=23; n <= 100; n++) {
            for (int r=1; r <=n; r++ ) {
                BigInteger combinations = combinations(new BigInteger("" + n), new BigInteger("" + r));
                if( combinations.compareTo(BigInteger.valueOf(1000000)) > 0 ) {
                    System.out.println(combinations);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
