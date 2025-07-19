class Solution {
    public int[] runningSum(int[] nums) {
       int n=nums.length;
       int sum=0;
        int[] res=new int[n];
        res[0]=nums[0];
        for(int i=0;i<n;i++){
             sum = nums[i] + sum;
             res[i]=sum;
        }
        return res;
    }
}