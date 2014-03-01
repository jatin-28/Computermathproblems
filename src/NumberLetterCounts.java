import java.util.HashMap;
import java.util.Map;

/**
 * User: jatin
 */
public class NumberLetterCounts {
    static Map<Integer, String> dictionary = new HashMap<Integer, String>(30);

    public static void init() {
        dictionary.put(1, "one");
        dictionary.put(2, "two");
        dictionary.put(3, "three");
        dictionary.put(4, "four");
        dictionary.put(5, "five");
        dictionary.put(6, "six");
        dictionary.put(7, "seven");
        dictionary.put(8, "eight");
        dictionary.put(9, "nine");
        dictionary.put(10, "ten");
        dictionary.put(11, "eleven");
        dictionary.put(12, "twelve");
        dictionary.put(13, "thirteen");
        dictionary.put(14, "fourteen");
        dictionary.put(15, "fifteen");
        dictionary.put(16, "sixteen");
        dictionary.put(17, "seventeen");
        dictionary.put(18, "eighteen");
        dictionary.put(19, "nineteen");
        dictionary.put(20, "twenty");
        dictionary.put(30, "thirty");
        dictionary.put(40, "forty");
        dictionary.put(50, "fifty");
        dictionary.put(60, "sixty");
        dictionary.put(70, "seventy");
        dictionary.put(80, "eighty");
        dictionary.put(90, "ninety");
        dictionary.put(100, "hundred");
        dictionary.put(1000, "thousand");
    }

    public static String numberToLetters(int n) {

        if( 1 <= n && n < 20 )
            return dictionary.get(n);

        if(20 <= n && n < 100)
            return processTens(n);

        if(100 <= n && n < 1000)
            return processHundreds(n);

        if( n == 1000)
            return "one thousand";

        return "";
    }

    private static String processHundreds(int n) {
        StringBuilder letters = new StringBuilder();
        int s = n / 100;
        letters.append(dictionary.get(s)).append(" ").append(dictionary.get(100));
        int r = n % 100;
        if( r > 0 ) {
            letters.append(" and ").append(numberToLetters(r));
        }

        return letters.toString();
    }

    private static String processTens(int n) {
        int r = n % 10;
        int s = n - r;

        StringBuilder letters = new StringBuilder(dictionary.get(s));
        if( r> 0) letters.append("-").append(dictionary.get(r));

        return letters.toString();
    }

    public static int countChars(String word) {
        String s = word.replaceAll("[ -]", "");
        return s.length();
    }

    public static void main(String[] args) {
        init();
        /*String word = numberToLetters(15);
        int count = countChars(word);
        System.out.println(word + " = " + count);
        */
        int sum = 0;
        for(int i=1; i <=1000; i++) {
            sum+= countChars(numberToLetters(i));
        }
        System.out.println(sum);
    }

}
