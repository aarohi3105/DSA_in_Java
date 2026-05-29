//LC 1343 – Number of Sub-arrays of Size K and Average ≥ Threshold
public class NoOfSubarrayswithSizeK {

    public static int numOfSubarrays(int[] arr, int k, int threshold) {

        int currSum = 0;
        int count = 0;

        // First window sum
        for (int i = 0; i < k; i++) {
            currSum += arr[i];
        }

        // Check first window average
        if ((double) currSum / k >= threshold) {
            count++;
        }

        // Sliding window
        for (int i = 1; i <= arr.length - k; i++) {

            currSum = currSum - arr[i - 1] + arr[i + k - 1];

            if ((double) currSum / k >= threshold) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;

        int result = numOfSubarrays(arr, k, threshold);

        System.out.println("Number of valid subarrays = " + result);
    }
}