public class MaximumSubarray {
    public  static int maxSum(int [] nums){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            currentSum= currentSum+nums[i];
            if(maxSum<currentSum){
                maxSum=currentSum;
            }
            if(currentSum<0){
                currentSum=0;
            }

        }
        return maxSum;
    }
    public static void main(String args[]){
        int[] nums={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSum(nums));
    }
}
