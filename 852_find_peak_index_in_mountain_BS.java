class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid==0)
            low=mid+1;
            else if(mid==arr.length-1)
            high=mid-1;
            else if(arr[mid]>arr[mid-1] && arr[mid+1]<arr[mid])
            return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid+1]>arr[mid])
            low=mid+1;
            else
            high=mid-1;
        }
        return -1;
    }
}
/*
TIME COMPLEXITY:- O(logN)
SPACE COMPLEXITY:- O(1)
*/
