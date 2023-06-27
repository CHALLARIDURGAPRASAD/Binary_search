import java.util.*;
public class Main
{
    public static int Binarysearch(int arr[],int target){
        int start=0;
        int end=arr.length;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            return target;
            else if(arr[mid]<target)
            start=mid+1;
            else
            end=mid-1;
        }
        return arr[start];
    }
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size if the array:");
	   int n=sc.nextInt();
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++)
	   arr[i]=sc.nextInt();
	   System.out.println("Enter the target value to find ceil");
	   int target=sc.nextInt();
	   int ans=Binarysearch(arr,target);
	   System.out.println("Ceil of the target value is:"+ans);
	}
}
/*
TIME COMPLEXITY:- O(log n)
SPACE COMPLEXITY:- O(1)
*/
