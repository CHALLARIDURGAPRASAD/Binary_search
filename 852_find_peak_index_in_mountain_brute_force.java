class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        for(int i=1;i<arr.length;i++){
            boolean check=true;
            for(int j=1;j<=i;j++){
                if(arr[j]<arr[j-1])
                {
                    check=false;
                    break;
                }
            }
            if(check==true){
                for(int j=i;j<arr.length-1;j++){
                    if(arr[j]<arr[j+1])
                    {
                        check=false;
                        break;
                    }
                }
            }
            if(check==true)
            return i;
        }
        return -1;
    }
}
/*
TIME COMPLEXITY:- O(N^2)
SPACE COMPLEXITY:- O(1)
*/
