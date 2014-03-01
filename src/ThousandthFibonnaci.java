import java.math.BigInteger;

/**
 * User: jatin
 */
public class ThousandthFibonnaci {
    public static void main(String[] args) {
        BigInteger a = BigInteger.ONE;
        BigInteger b = BigInteger.ONE;
        int counter = 2;

        while (true) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
            counter++;
            if(c.toString().length() == 1000) {
                System.out.println(counter);
                break;
            }
        }
    }
}
