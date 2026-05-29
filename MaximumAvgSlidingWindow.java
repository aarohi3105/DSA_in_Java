public class MaximumAvgSlidingWindow {

    public static double findMaxAverage(int[] nums, int k) {
        int currSum = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            currSum += nums[i];
        }

        int maxSum = currSum;

        // Sliding window
        for (int i = 1; i <= nums.length - k; i++) {
            currSum = currSum - nums[i - 1] + nums[i + k - 1];
            maxSum = Math.max(currSum, maxSum);
        }

        return (double) maxSum / k;
    }

    public static void main(String[] args) {

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);

        System.out.println("Maximum Average = " + result);
    }
}