class Solution {
    public void Binaryleft(int arr[],int target,int ans[]){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans[0]=mid;
                high=mid-1;
            }
            else if(arr[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
    }
    public void Binaryright(int arr[],int target,int ans[]){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                ans[1]=mid;
                low=mid+1;
            }
            else if(arr[mid]<target)
            low=mid+1;
            else
            high=mid-1;
        }
    }
    public int[] searchRange(int[] nums, int target) {
        int ans[]=new int[2];
        ans[0]=-1;
        ans[1]=-1;
        Binaryleft(nums,target,ans);
        Binaryright(nums,target,ans);
        return ans;
    }
}
/*
TIME COMPLEXITY:- O(logN)+O(logN) ~=O(logN)
SPACE COMPLEXITY:- O(1)
  */
