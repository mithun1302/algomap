package com.mithun.algomap;

public class binarySearch {
    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;
        int left = 0;
        int right = nums.length-1;
        for(int i=0;i<nums.length;i++){
            int m = left+right/2;
            if(target>nums[i]){
                left = m+1;
            }
            else if(target<nums[i]){
                right=m-1;
            }
            else {
                System.out.println(i);
                break;
            }
        }
    }
}
