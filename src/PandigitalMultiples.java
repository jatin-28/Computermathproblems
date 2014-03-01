import utils.Utils;

/**
 * User: jatin
 */
public class PandigitalMultiples {

    public static boolean isPandigital(String value) {
        return "123456789".equals(Utils.sortedString(value));
    }

    public static boolean hasDuplicateNumbers(String line) {
        for(char c= '1'; c <= '9'; c++ ) {
            int count = line.length() - line.replace(c + "", "").length();
            if( count > 1) return true;
        }
        return false;
    }


    public static void main(String[] args) {
        long largestPan = 0;

        for(long i=1; i < 987654321; i++) {
        //for(long i=9; i < 10; i++) {
            int n = 1;
            String concat = "";
            while (concat.length() < 10) {
                concat += i*n++;

                if( hasDuplicateNumbers(concat)) break;

                if(concat.length() == 9 && isPandigital(concat)) {
                    Long aLong = Long.valueOf(concat);
                    System.out.println(aLong);
                    if( aLong > largestPan ) largestPan = aLong;
                    break;
                }
            }
        }
        System.out.println("largest: " + largestPan);
    }
}
