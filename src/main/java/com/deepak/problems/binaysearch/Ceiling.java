package com.deepak.problems.binaysearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,5,7,10,15,17,23,26,32,36,42};
        int target = 43;
        System.out.println(findCeiling(arr,target));
    }

    private static int findCeiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length -1;

        if(arr[arr.length - 1] < target){
            return -1;
        }
        while(start <= end){
            int mid  = start + (end - start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return start;
        //for wrap around below
        //return start % arr.length;
    }
}
