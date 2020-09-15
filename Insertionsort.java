package Advprog;


public class Insertionsort {
 public static void sort(int arr[])
 {
	 int n = arr.length;
	 for(int i=1;i<n;i++)
	 {
		 int temp = arr[i];
		 int j = i-1;
		 while((j>=0) && (arr[j]>temp))
		 {
			  arr[j+1] = arr[j];
			  j--;
			  
			 
		 }
		 arr[j+1] = temp;
		 
	 }
 }
 public static void main(String args[])
 {
	 int arr[] = {9,4,5,35,46,22};
	 Insertionsort.sort(arr);
	 for(int elm : arr)
	 {
		 System.out.println(elm+" ");
	 }
 }
}
