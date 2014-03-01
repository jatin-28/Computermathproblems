import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * User: jatin
 */
public class ReciprocalCycles {
    public static void main(String[] args) {
        int maxRecurringSize = 0;
        int number = 0;
        for(int i=2; i < 1000; i++) {
            BigDecimal fraction = BigDecimal.ONE.divide(new BigDecimal(i),2000, RoundingMode.HALF_DOWN);
            String dec = fraction.toPlainString();
            System.out.print(dec);
            int size = recurring(dec);
            if(size > maxRecurringSize) {
                maxRecurringSize = size;
                number = i;
            }
            System.out.println(" ------ " + size);
        }
        System.out.println(number + " largest : " + maxRecurringSize);
    }

    private static int recurring(String dec) {
        int recurringSize = 0;
        int pos = 0;
        while(pos < dec.length()) {
            StringBuilder sb = new StringBuilder();
            sb.append(dec.charAt(pos));
            int size = match(dec, sb, pos);
            if( size > recurringSize) recurringSize = size;
            pos++;
        }
        return recurringSize;
    }

    private static int match(String dec, StringBuilder sb, int pos) {
        int index = dec.indexOf(sb.toString(), pos + 1);
        if(  index > -1) {
            pos++;
            if( pos == dec.length() || pos == index) {
                return sb.length();
            }
            sb.append(dec.charAt(pos));
            return match(dec, sb, pos);
        }
        return sb.length();
    }
}
