package Array;

/**
 * @author janaksapkota
 *         this is the question from leets question where we just go find the
 *         best prices to do buy the stock
 *         at the same time
 * 
 *         the task to complet is that i need to come up with my own solutions
 *         to this questions
 * 
 * 
 * 
 */
public class Buystock {

    public static int maxprofit(int[] prices) {
        int profit = 0;
        int buyprice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < buyprice) {
                buyprice = prices[i];

            } else if (prices[i] - buyprice > profit) {
                profit = prices[i] - buyprice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {

        System.out.println(maxprofit(new int[] { 7, 6, 4, 3, 1 }));
        System.out.println(maxprofit(new int[] { 7, 1, 5, 3, 6, 4 }));

    }

}
