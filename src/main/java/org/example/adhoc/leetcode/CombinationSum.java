package org.example.adhoc.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {
    Set<List<Integer>> ans = new HashSet<>();
    public Set<List<Integer>> combinationSum(int[] nums, int target) {
        generate(nums, 0, target, new ArrayList<>());

        return ans;
    }

    public void generate(int[] nums, int st, int target, List<Integer> array){
        if (target == 0){
            ans.add(new ArrayList<>(array));
        }
        if (target < 0){
            return;
        }

        for(int i = st; i < nums.length; i++){
            if (target >= nums[i]){
                array.add(nums[i]);
                generate(nums, i, target-nums[i], array);
                array.remove(array.size() -1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSum obj = new CombinationSum();
        int[] arr = {2,3,6,7};
        Set<List<Integer>> ans = obj.combinationSum(arr, 7);
        System.out.println(ans);
    }
}
