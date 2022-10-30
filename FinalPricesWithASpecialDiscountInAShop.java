//https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
//Leetcode1475
/*
You are given an integer array prices where prices[i] is the price of the ith item in a shop.

There is a special discount for items in the shop. If you buy the ith item, then you will receive a discount
equivalent to prices[j] where j is the minimum index such that j > i and prices[j] <= prices[i]. Otherwise, you will
not receive any discount at all.

Return an integer array answer where answer[i] is the final price you will pay for the ith item of the shop,
considering the special discount.
 */
public class FinalPricesWithASpecialDiscountInAShop {

    /*
    Using inner loop to search next small number
    Time complexity o(n^2)
    Space complexity o(1)
     */
    public int[] finalPrices(int[] prices) {

        for(int i=0; i<prices.length-1; i++){
            for(int j=i+1 ; j<prices.length; j++){
                if(prices[j] <= prices[i]){
                    prices[i]-=prices[j];
                    break;
                }
            }
        }
        return prices;
    }

    /*
    Stack to track next small number
    Time complexity o(2n) -- o(n)
    Space complexity o(n)
     */
    public int[] finalPrices(int[] prices) {

        Stack<Integer> stack = new Stack<>();

        for(int i=prices.length-1; i >=0; i--){

            while(!stack.isEmpty() && stack.peek() > prices[i])
                stack.pop();

            int num =prices[i];

            if(stack.isEmpty())
                prices[i] = num;
            else
                prices[i] = num-stack.peek();
            stack.push(num);

        }
        return prices;
    }

}
