/**
 * User: jatin
 */
public class SumOfEvenFibonnacci {

    public static int nextFib(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int previousFib = 1;
        int lastFib = 1;
        int sumOfEven = 0;

        while( lastFib < 4000000) {
            int currentFib = nextFib(previousFib, lastFib);
            if(currentFib > 4000000) break;
            previousFib = lastFib;
            lastFib = currentFib;
            if( lastFib % 2 == 0) sumOfEven += lastFib;
        }
        System.out.println("Sum: " + sumOfEven);
    }

}
