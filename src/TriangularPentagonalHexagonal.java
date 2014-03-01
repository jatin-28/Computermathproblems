/**
 * User: jatin
 */
public class TriangularPentagonalHexagonal {

    public static boolean checkPentagonal(long p) {
        double v = (1 + Math.sqrt(1 + 24 * p)) / 6;
        return v == Math.floor(v);
    }

    public static boolean checkHexagonal(long h) {
        double v = (1+Math.sqrt( 1+ 8 * h)) /4;
        return v == Math.floor(v);
    }

    public static long triangleNumber(long n) {
        return n * (n + 1 ) / 2;
    }

    public static void main(String[] args) {
        for(int i=286; i < Integer.MAX_VALUE; i++) {
            long tri = triangleNumber(i);
            if(checkPentagonal(tri) && checkHexagonal(tri)) {
                System.out.println(tri);
                System.exit(0);
            }
        }
    }
}
