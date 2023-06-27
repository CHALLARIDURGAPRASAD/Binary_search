class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int low=0,high=letters.length-1;
      while(low<=high){
          int mid=low+(high-low)/2;
          if(letters[mid]<=target)
         low=mid+1;
          else
          high=mid-1;
      }
      low=low%letters.length;
      return letters[low];
    }
}
/*
TIME COMPLEXITY:- O(logN)
SPACE COMPLEXITY:- O(1)
  */
