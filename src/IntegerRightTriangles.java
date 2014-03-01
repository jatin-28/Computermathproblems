import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * User: jatin
 */
public class IntegerRightTriangles {
    static Map<Double, Set<String>> mapOfSets = new HashMap<Double, Set<String>>();

    public static void main(String[] args) {
        for(long a=1; a < 1000; a++ ) {
            for(long b=1; b < 1000; b++ ) {
                double c = hypotenuse(a, b);
                if(c > 0) {
                    double perimeter = a + b + c;
                    if ( perimeter <= 1000) {
                        Set<String> set = mapOfSets.get(perimeter);
                        if( set == null) {
                            set = new HashSet<String>();
                            mapOfSets.put(perimeter, set);
                        }
                        set.add(MessageFormat.format("({0},{1},{2}})", a, b, c));
                    }
                }
            }
        }

        double largestPerimeter = 0;
        int maxCount = 0;
        for (Map.Entry<Double, Set<String>> doubleSetEntry : mapOfSets.entrySet()) {
            int tempSize = doubleSetEntry.getValue().size();
            if( tempSize > maxCount) {
                maxCount = tempSize;
                largestPerimeter = doubleSetEntry.getKey();
            }
        }
        System.out.println(largestPerimeter);
    }

    private static double hypotenuse(double a, double b) {
        double sqrt = Math.sqrt(a * a + b * b);

        if( Math.floor(sqrt) == sqrt) return sqrt;

        return 0;
    }
}
