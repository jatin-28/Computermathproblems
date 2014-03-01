import java.text.MessageFormat;

/**
 * User: jatin
 */
public class PythegarianTriplet {

    public static void main(String[] args) {
        for(int a=0; a < 900; a++) {
            for(int b=0; b < 900; b++) {
                int csqr = sqr(a) + sqr(b);
                Double cDouble = Math.sqrt(csqr);
                if( a + b + cDouble == 1000) {
                    System.out.println(MessageFormat.format("{0} x {1} x {2} = {3}", a, b, cDouble, a * b * cDouble));
                }
            }
        }
    }

    public static int sqr(int a) {
        return a * a;
    }
}
