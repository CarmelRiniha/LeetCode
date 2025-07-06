import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int m = nums.length;
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int m = scanner.nextInt();
        System.out.println("Enter array elements:");
        int[] nums = new int[m];
        for (int i = 0; i < m; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter target: ");
        int target = scanner.nextInt();
        int[] res = new Solution().twoSum(nums, target);
        if (res.length == 2) {
            System.out.println("Indices: [" + res[0] + ", " + res[1] + "]");
        } else {
            System.out.println("No solution found.");
        }
        scanner.close();
    }
}
