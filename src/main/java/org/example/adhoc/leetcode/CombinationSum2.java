package org.example.adhoc.leetcode;

import java.util.*;

public class CombinationSum2 {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Arrays.sort(nums);
        generate(nums, target, 0, new ArrayList<>());
        return ans;
    }

    public void generate(int[] nums, int target, int st, List<Integer> arr){
        if(target == 0){
            ans.add(new ArrayList<>(arr));
        }

        if(target < 0){
            return;
        }

        for(int i = st; i < nums.length; i++){
            if (i > st && nums[i]==nums[i-1]) continue;
            if (target >= nums[i]){
                arr.add(nums[i]);
                generate(nums, target-nums[i], i+1, arr);
                arr.remove(arr.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum2 obj = new CombinationSum2();
        int[] arr = {1, 1, 1, 2, 2};
        List<List<Integer>> ans = obj.combinationSum(arr, 4);
        System.out.println(ans);
    }
}
