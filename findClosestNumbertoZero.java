package com.mithun.algomap;

public class findClosestNumbertoZero {
    public static void main(String[] args) {
        int[] nums = {2,-1,1};
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            int diff = Math.abs(ans);
            int curr = Math.abs(nums[i]);
            if(curr<diff){
                ans = nums[i];
            }
            else if(curr == diff){
                ans = Math.max(ans,nums[i]);
            }
        }
        System.out.println(ans);
    }
}
