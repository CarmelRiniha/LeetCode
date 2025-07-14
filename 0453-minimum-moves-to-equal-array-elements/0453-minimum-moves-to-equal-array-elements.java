class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int minVal = nums[0];
        long sum = nums[0];

        for (int i = 1; i < n; i++) {
            sum += nums[i];
            if (nums[i] < minVal) {
                minVal = nums[i];
            }
        }
        return (int)(sum - (long)n * minVal);
    }
}
