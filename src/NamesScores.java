import java.io.File;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * User: jatin
 */
public class NamesScores {
    private static String filename = "names.txt";
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
        long totalNameSumScore = 0;
        int pos = 0;
        for (String name : orderedName) {
            pos++;
            long sumOfName = sumOfDigits(name);
            totalNameSumScore += pos * sumOfName;

            /*if(name.equals("COLIN")) {
                long sumOfName = sumOfDigits(name);
                totalNameSumScore += pos * sumOfName;
                System.out.println(pos);
                System.out.println(sumOfName);
                System.out.println(totalNameSumScore);
                return ;
            }*/
        }
        System.out.println(orderedName);
        System.out.println(totalNameSumScore);
    }

}
