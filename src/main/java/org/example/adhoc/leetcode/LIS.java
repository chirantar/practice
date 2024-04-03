package org.example.adhoc.leetcode;

public class LIS {
    public int lengthOfLIS(int[] nums) {
        int ans = solve(nums, nums.length-1);
        return ans;
    }

    public int solve(int[] nums, int n){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }
        int max = 1;
        for(int j = n-1; j>=0; j--){
            if(nums[n] > nums[j]){
                max = Math.max(max, 1 + solve(nums, j));
            }
        }
        System.out.println("n = " + n + " Max = " + max);
        return max;
    }

    public static void main(String[] args) {
//        int[] nums = {3, 4, 5};
        int[] nums = {10,9,2,5,3,7,101,18};
        LIS obj = new LIS();
        int ans = obj.lengthOfLIS(nums);
        System.out.println(ans);
    }
}
