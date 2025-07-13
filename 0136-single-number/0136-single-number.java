import java.util.Arrays;

class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i = 0, n = nums.length;
        while (i < n - 1) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
            i += 2;
        }
        return nums[n - 1];
    }
}
