import java.util.Stack;
//leetcode 503
public class NextGreaterElementII {

    /*
    Using stack
    SpaceComplexity o(2n) = o(n)
    Time complexity o(n)+o(n) = o(n)
    1-Insert elements of the array into stack from the last index
    2-check for the next greater element
     */

    public int[] nextGreaterElements(int[] nums) {
        int[] result = new int[nums.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=nums.length-1; i>=0; i--){
            stack.push(nums[i]);
        }

        for(int i=nums.length-1; i>=0; i--){
            if(nums[i] < stack.peek()){
                result[i] = stack.peek();
                stack.push(nums[i]);
            }else{
                while(!stack.isEmpty() && nums[i] >= stack.peek())
                    stack.pop();
                if(!stack.isEmpty()){
                    result[i] = stack.peek();
                    stack.push(nums[i]);
                }else{
                    result[i] = -1;
                    stack.push(nums[i]);
                }

            }
        }
        return result;
    }
}
