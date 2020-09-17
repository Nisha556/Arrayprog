package Advprog;

public class RepeatElement {
 static void comp(int arr[])
 {
	 int  n = arr.length;
	 for(int i = 0;i<n ;i++)
	 {
		 for(int j = i+1;j<n;j++)
		 {
			 if(arr[i]==arr[j])
			 {
				 System.out.println("the value of arr " + arr[i]);
				 
			 }
		 }
	 }
 }
 public static void main(String args[])
 {
	 int arr[]= {10,10,30,20,20,80};
	 RepeatElement.comp(arr);
	 for(int elm : arr)
	 {
		 System.out.println(elm + " ");
	 }
 }
}
