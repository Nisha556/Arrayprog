package Advprog;

public class BinarySearch {
 int binarysearch(int arr[],int l, int r, int x)
 {
	 if(r>=l)
	 {
		 int mid = l+(r-l)/2;
		 if(arr[mid]==x)
		 {
			 return mid;
			 
		 }
		 if(arr[mid]>x)
		 {
			 return binarysearch(arr,l,mid-1,x);
			
		 }
		 return binarysearch(arr,mid+1,r,x);
		 
	 }
	 return -1;
 }
 public static void main(String args[])
 {
	 BinarySearch  ob = new BinarySearch();
	 int arr[] = {10,6,4,3};
	 int n = arr.length;
		int x = 6;
		int result = ob.binarysearch(arr, 0, n - 1, x);
		if(result== -1)
			System.out.println(" Element not present ");
		else
			System.out.println(" Element found at index "    +    result);
 }
}
