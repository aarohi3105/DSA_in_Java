public class MaximumSumSubarraywithIndices {

        public  static int maxSum(int [] nums){
            int currentSum=0;
            int maxSum=Integer.MIN_VALUE;
            int start=0;
            int end=0;
            int tempStart=0;
            for(int i=0;i<nums.length;i++){
                currentSum= currentSum+nums[i];
                if(maxSum<currentSum){
                    maxSum=currentSum;
                    start=tempStart;
                    end=i;
                }
                if(currentSum<0){
                    currentSum=0;
                    tempStart=i+1;

                }

            }
            System.out.println("subarray size "+ start+ " - " + end);
            return maxSum;
        }
        public static void main(String args[]){
            int[] nums={-2,1,-3,4,-1,2,1,-5,4};
           // int[] nums={-2,-4,-3,-5,-1};

            System.out.println(maxSum(nums));


        }
    }


