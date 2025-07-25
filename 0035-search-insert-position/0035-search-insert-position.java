
class Solution {
    public int searchInsert(int[] nums, int target) {
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            if (nums[size - 1] < target) {
                return size;
            }
            if (i + 1 < size && nums[i] < target && nums[i + 1] > target) {
                return i + 1;
            }
        }
        for (int i = 0; i < size; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return size;
    }
}
