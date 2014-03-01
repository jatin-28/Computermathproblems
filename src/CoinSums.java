import java.util.ArrayList;

/**
 * User: jatin
 */
public class CoinSums {
    static final int[] coins = new int[] {1,2,5,10,20,50,100,200};
    static int combinations = 0;

    public static void sumCoins(int sum, ArrayList<Integer> coinCombinationList, int index) {
        sum += coins[index];
        if( sum == 200 ) {
            coinCombinationList.add(coins[index]);
            System.out.println("200 = " + coinCombinationList);
            combinations++;
            return ;
        }

        if( sum > 200) {
            return ;
        }

        coinCombinationList.add(coins[index]);
        sumCoins(sum, (ArrayList<Integer>) coinCombinationList.clone(), index);

        while( index < coins.length - 1) {
            sumCoins(sum, (ArrayList<Integer>) coinCombinationList.clone(), ++index);
        }
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for(int coinIndex=0; coinIndex < coins.length; coinIndex++) {
            sumCoins(0, new ArrayList<Integer>(), coinIndex);
        }
        System.out.println("Combinations: " + combinations);
        System.out.println("Time: " + (System.currentTimeMillis() - start) );
    }
}
