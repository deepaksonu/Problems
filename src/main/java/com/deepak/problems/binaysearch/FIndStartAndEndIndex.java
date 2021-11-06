package com.deepak.problems.binaysearch;

public class FIndStartAndEndIndex {
    public static void main(String[] args) {
        int[] arr = {2,3,3,7,7,7,8,8,9};
        int target = 7;
        int[] ans = {-1,-1};
        ans[0] = findIndex(arr, target, true);
        ans[1] = findIndex(arr, target, false);
        System.out.println("start : " + ans[0] + " end : " + ans[1]);
    }

    static int findIndex(int[] arr,int target,boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = arr.length -1;

        while (start <= end){
            int mid = start + (end -start)/2;
            if(target < arr[mid]){
                end = mid -1;
            }else if (target > arr[mid]){
                start = mid +1;
            }else {
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
