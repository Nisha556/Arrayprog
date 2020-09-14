package Sorting_searching;

public class comparr {
public static void comp(int [] arr1,int[] arr2 )
{
	 int  n = arr1.length;
	  n = arr2.length;
	 
	 int []temp = new int[n];
	for(int i=0;i<arr1.length;i++)
	
	{
			if(arr1[i]>arr2[i])
			{ temp [i]=arr1[i];
			
				//System.out.println("the value of " + temp[i]);
			}
			else if (arr2[i]>arr1[i])
			{
				temp[i] = arr2[i];
				//System.out.println("the value of  " + temp[i]);
			}
			
		}
	System.out.println("the greater number is ");
	for(int j =0;j<n;j++)
	{ 
		 
		System.out.println(temp[j]);
		
	}
}

 public static void main(String args[])
 {
	 int arr1[] = {10,5,6,70,3};
	 int arr2[] = {3,26,2,35,45};
	 comparr.comp(arr1,arr2);
 }
}
