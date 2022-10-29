//https://leetcode.com/problems/daily-temperatures/
class DailyTemperatures {
    /*
    Using 2 stack
    Time complexity - o(n)
    space complexity - o(n) + o(n) -----> o(n)
    1st stack to maintain next highest temperature
    2nd stack to maintain corresponding index
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> tempratureStack = new Stack<>();
        Stack<Integer> indexStack = new Stack<>();

        result[temperatures.length-1]=0;
        tempratureStack.push(temperatures[temperatures.length-1]);
        indexStack.push(temperatures.length-1);

        for(int i=temperatures.length-2; i>=0; i--){
            if(!tempratureStack.isEmpty() && temperatures[i] < tempratureStack.peek())
                result[i] = indexStack.peek() - i;
            else{
                while(!tempratureStack.isEmpty() && temperatures[i] >= tempratureStack.peek()){
                    tempratureStack.pop();
                    indexStack.pop();
                }
                if(!tempratureStack.isEmpty())
                    result[i] = indexStack.peek() - i;
                else
                    result[i] = 0;
            }
            tempratureStack.push(temperatures[i]);
            indexStack.push(i);
        }
        return result;
    }

    /*
    Using 1 stack
    Time complexity - o(n)
    space complexity - o(n)
    Stack to maintain next highest temperature's corresponding index
     */
    public int[] dailyTemperatures1(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> indexStack = new Stack<>();

        result[temperatures.length-1]=0;
        indexStack.push(temperatures.length-1);

        for(int i=temperatures.length-2; i>=0; i--){
            if(!indexStack.isEmpty() && temperatures[i] < temperatures[indexStack.peek()])
                result[i] = indexStack.peek() - i;
            else{
                while(!indexStack.isEmpty() && temperatures[i] >= temperatures[indexStack.peek()]){
                    indexStack.pop();
                }
                if(!indexStack.isEmpty())
                    result[i] = indexStack.peek() - i;
                else
                    result[i] = 0;
            }
            indexStack.push(i);
        }
        return result;
    }
}
