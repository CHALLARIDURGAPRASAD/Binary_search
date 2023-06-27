import java.util.*;
public class Main
{
    public static void findingchunk(int arr[],int target,int ans[]){
        int start=0;
        int end=1;
        while(target>arr[end]){
            int start1=end+1;
            end=end+(end-start+1)*2;
            start=start1;
        }
         ans[0]=BinarySearch(arr,target,start,end);
    }
    public static int BinarySearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target)
            return mid;
            else if(arr[mid]<target)
            start=mid+1;
            else
            end=mid-1;
        }
        return -1;
    }
	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  int n=sc.nextInt();
	  int arr[]=new int[n];
	  for(int i=0;i<n;i++)
	  arr[i]=sc.nextInt();
	  int ans[]=new int[1];
	  ans[0]=-1;
	  System.out.println("Enter the target element you want to find:");
	  int target=sc.nextInt();
	  findingchunk(arr,target,ans);
	  System.out.println(ans[0]);
	}
}
/*
TIME COMPLEXITY:- O(logN)
SPACE COMPLEXITY:- O(1)
  */
