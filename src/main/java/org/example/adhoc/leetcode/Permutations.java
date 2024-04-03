package org.example.adhoc.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums){
        int st = 0;
        solve(nums, ans, st);

        return ans;
    }

    private void solve(int[] nums, List<List<Integer>> ans, int st) {
        //           123
   //   123          213         321
   // 123 132      213 231      321 312

//         -  -  -

        if(st == nums.length){
            ans.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        }

        for(int i = st; i < nums.length; i++){
            swap(i, st, nums, true);
            solve(nums, ans, st+1);
            swap(i, st, nums, false);
        }


    }

    private void swap(int i , int j, int[] nums, boolean entry){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

        if(entry) {
            Arrays.stream(nums).forEach(s -> System.out.print(s + ", "));
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Permutations obj = new Permutations();
        obj.permute(new int[]{1,2,3});
        System.out.println(obj.ans);
    }
}
