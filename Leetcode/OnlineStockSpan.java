/*
https://leetcode.com/problems/online-stock-span/description/
 */
public class OnlineStockSpan {

    /*
    Time complexity o(n)
    Space complexity o(n)
    Using stack to hold price and days pair
     */
    Stack<int[]> monotonicPrice = new Stack<>();
    public OnlineStockSpan() {

    }

    public int next(int price) {
        int res=1;
        while( !monotonicPrice.isEmpty() && monotonicPrice.peek()[0] <= price ){
            res += monotonicPrice.pop()[1];
        }
        monotonicPrice.push(new int[] { price, res});
        return res;
    }


    /*
        Time complexity o(n)
        Space complexity o(n)
        Using 2 stacks to hold price and days
    */
    Stack<Integer> monotonicPrice = new Stack<>();
    Stack<Integer> dayCount = new Stack<>();

    public int next(int price) {
        int res=1;
        while( !monotonicPrice.isEmpty() && monotonicPrice.peek() <= price ){
            res+=dayCount.pop();
            monotonicPrice.pop();
        }
        monotonicPrice.push(price);
        dayCount.push(res);

        return res;
    }
}
