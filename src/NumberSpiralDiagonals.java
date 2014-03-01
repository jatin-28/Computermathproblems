/**
 * User: jatin
 */
public class NumberSpiralDiagonals {
    public static void main(String[] args) {
        long current = System.currentTimeMillis();

        long spiralSize = 1;
        long diagonalSum = 1;
        long startingNumber = 1;
        do {
            spiralSize += 2;
            startingNumber += spiralSize -1;
            for(long i=startingNumber; i <= (spiralSize * spiralSize); i += spiralSize -1) {
                diagonalSum += i;
            }
            startingNumber = spiralSize * spiralSize;
        } while (spiralSize < 1001);
        System.out.println(diagonalSum);
        System.out.println("Time: " + (System.currentTimeMillis() - current));
    }
}
