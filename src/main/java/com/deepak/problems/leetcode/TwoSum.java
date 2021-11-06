package com.deepak.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args){
        System.out.println(getLabel("Apr 1. 4:28 PM EPD VOLCKER"));
        int[] nums = {3,2,4};
        int target = 6;
        int[] ans = twoSum(nums,target);
        System.out.println(ans[0] + " : " + ans[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> numMap = new HashMap<>();
        int[] ans = {-1,-1};
        for (int i = 0; i < nums.length ; i++) {
            System.out.println(numMap);
            if(numMap.containsKey(nums[i])){
                ans[0] = numMap.get(nums[i]);
                ans[1] = i;
                return ans;
            }
            numMap.put(target-nums[i],i);
        }
        return ans;
    }

    private static String getLabel(String label){
        int am = label.indexOf("AM");
        int pm = label.indexOf("PM");

        return label.substring((am == -1? pm ==-1 ? 0: pm+2 : am+2), label.length());
    }
}
