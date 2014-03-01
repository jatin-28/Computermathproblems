/**
 * User: jatin
 */
public class SumSquareDifference {


    public static void main(String[] args) {
        int sumOfSqrs = 0;
        int total = 0;

        for(int i=1; i < 101; i++) {
            sumOfSqrs += sqr(i);
            total += i;
        }

        System.out.println(sqr(total) - sumOfSqrs);

    }


    public static int sqr(int a) {
        return a * a;
    }

}
