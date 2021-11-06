package com.deepak.problems.binaysearch;

public class Floor {

    public static void main(String[] args) {
        int[] arr = {2,5,7,10,15,17,23,26,32,36,42};
        int target = 1;
        System.out.println(findFloor(arr,target));
    }

    private static int findFloor(int[] arr, int target) {

        int start = 0;
        int end = arr.length -1;

        while(start <= end){
            int mid = start + (end -start)/2;

            if(target < arr[mid]){
                end = mid -1 ;
            }else if (target > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }

        return end;
    }
}
