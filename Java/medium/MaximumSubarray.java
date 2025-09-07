package medium;

public class MaximumSubarray{
        public int maxSubArray(int[] nums) {
        // Start with the first number.
        // This handles arrays of size 1 and also "all negatives".
        int currentSum = nums[0];
        int bestSum = nums[0];

        // Look at each next number and decide:
        // "Do I keep my current streak, or start fresh from this number?"
        for (int i = 1; i < nums.length; i++) {
            int x = nums[i];

            // Option A: extend the streak -> currentSum + x
            // Option B: start fresh at x
            currentSum = Math.max(x, currentSum + x);

            // Track the best we've ever seen
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }
}