/**
 * User: jatin
 */
public class LargestPalindromeProduct {

    public static void main(String[] args) {
        int largestPalindrome = 0;
        for(int i = 999; i > 100; i--) {
            for(int j=999; j > 100; j--) {
                int calc = i * j;
                if( isPalindrom( calc + "")) {
                    System.out.println(String.format("%d x %d = %d", i,j,calc));
                    if(calc > largestPalindrome) largestPalindrome = calc;
                }
            }
        }
        System.out.println("Largest palindrome: " + largestPalindrome);
    }

    public static boolean isPalindrom(String str) {
        StringBuilder reversed = new StringBuilder(str).reverse();
        return reversed.toString().equals(str);
    }

}
