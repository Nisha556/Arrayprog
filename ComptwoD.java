package Advprog;

package Sorting_searching;

import Sorting_searching.ComptwoD;

//greater element in 2D  array
public class ComptwoD {
public static void comp(int arr1[][],  int arr2[][])
{
	 int n = arr1.length;
	 n = arr2.length;
	 int [][]temp = new int[n][n];
	 for(int i =0;i<n;i++)
	 {
		 for(int j =0;j<n;j++)
			 if (arr1[i][j]>arr2[i][j])
			 {
				 temp[i][j] = arr1[i][j];
				 
			 }
			 else if(arr2[i][j]>arr1[i][j])
			 {
				 temp[i][j] = arr2[i][j];
			 }
		 
				 
	 }
	 System.out.println("the greater number is");
	 for(int k =0;k<n;k++)
	 {
		 for(int s=0;s<n;s++)
		 {
			 System.out.println(temp[k][s]);
		 }
	 }
	
	 
	 
}
public static void main(String args[])
{
	  int arr1 [][] = {{1,3,4},{2,4,8},{3,4,5}};
	  int arr2[][] = {{2,4,9},{1,2,4},{6,7,2}};
	  ComptwoD.comp(arr1, arr2);
}

}
