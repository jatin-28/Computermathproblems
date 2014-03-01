import java.util.Arrays;

/**
 * User: jatin
 */
public class PermutedMulitples {
    public static void main(String[] args) {
        for(long x=1; x < 1000000; x++){
            boolean check = checkMultiple(x);
            if(check) {
                System.out.println(x);
                break;
            }
        }
    }

    private static boolean checkMultiple(long x) {
        boolean check = false;

        for(long m=2; m < 7; m++) {
            long sum = x * m;
            check = compareSameDigits(x + "", sum + "");
            if( !check) return false;

        }
        return check;
    }

    private static boolean compareSameDigits(String x, String multiple) {
        return sortChars(x).equals( sortChars(multiple));
    }

    private static String sortChars(String x) {
        char[] chars = x.toCharArray();
        Arrays.sort(chars);
        return String.valueOf(chars);
    }


}
