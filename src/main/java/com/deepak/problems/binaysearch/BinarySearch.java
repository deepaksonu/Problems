package com.deepak.problems.binaysearch;


public class BinarySearch {
    public static void main(String[] args) {

        int[] arr = {2,5,7,10,15,17,23,26,32,36,42};
        int target = 42;
        System.out.println(binarySearch(arr,target));
    }

    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;
            System.out.println("start : " + start + " mid : " + mid + " end : " + end);
            if(arr[mid] > target){
                end = mid - 1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else return mid;

        }

        return -1;
    }


}
