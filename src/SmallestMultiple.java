/**
 * User: jatin
 */
public class SmallestMultiple {

    public static void main(String[] args) {
        int smallestMultiple = 1000;
        boolean finished = true;

        do {
            for(int i=1; i < 20; i++){
                if (smallestMultiple % i > 0) {
                    smallestMultiple++;
                    finished = false;
                    break;
                }
                finished = true;
            }
        } while (!finished);

        System.out.println("smallest multiple: " +smallestMultiple);
    }
}
