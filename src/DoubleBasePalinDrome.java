import static utils.Utils.isPalindrom;

/**
 * User: jatin
 */
public class DoubleBasePalinDrome {

    public static void main(String[] args) {
        long sum = 0;
        for(int i=1; i < 1000000; i++) {
            if(isPalindrom(i + "")) {
                String binary = Integer.toBinaryString(i);
                if(binary.startsWith("0")) continue;

                if( isPalindrom(binary)) {
                    System.out.println(i + " = " + binary);
                    sum+=i;
                }
            }
        }
        System.out.println("sum: " + sum);
    }

}
