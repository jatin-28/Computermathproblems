import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * User: jatin
 */
public class CodedTriangleNumbers {
    private static String filename = "words.txt";
    static Set<String> orderedName = new TreeSet<String>();

    public static void readInFile() throws Exception {
        Scanner scanner = new Scanner(new File(filename));
        try {
            scanner.useDelimiter(",");
            while (scanner.hasNext()) {
                orderedName.add(scanner.next().replaceAll("\"", ""));
            }
        } finally {
            scanner.close();
        }
    }

    public static long sumOfDigits(String s) {
        char[] chars = s.toCharArray();
        long sum = 0;
        for (char aChar : chars) {
            sum += ((int)aChar) - 'A' + 1;
        }
        return sum;
    }

    public static void main(String[] args) throws Exception {
        readInFile();
        long count=0;
        for (String name : orderedName) {
            long sumOfName = sumOfDigits(name);

            if(isTriangle(sumOfName)) count++;

        }
        System.out.println(count);
    }

    private static boolean isTriangle(long t) {
        double v = (Math.sqrt(1 + 8 * t) - 1) / 2;
        return v == Math.floor(v);
    }


}
