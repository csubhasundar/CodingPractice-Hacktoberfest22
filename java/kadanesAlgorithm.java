// kadanes algorithm for finding the maximim sum from a subarray. The method goes as adding the consecutive items 
// on the flow and check if it is max or not and if not the subarray starts again fresh from where it is not satisfied, 
//because the negative values might decrease the total sum 


class kadanesAlgorithm{
    public static void main(String[] args) {
        int inputArray[]={-2,3,1,-4,6,2,0};

        System.out.println(arrayMaxConsecutiveSum(inputArray));
    }

    public static int arrayMaxConsecutiveSum(int[] inputArray){
        
        int max_sum=inputArray[0];
        int current_sum=max_sum;

        for(int i=1; i<inputArray.length; i++){ //i=1 as 0th item already assigned to max_sum
            current_sum=Math.max(inputArray[i]+current_sum, inputArray[i]);
            max_sum=Math.max(current_sum,max_sum);
        }
        
        return max_sum;
    }
}